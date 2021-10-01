package com.dbtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dbtest.R
import com.dbtest.database.SchoolDatabase
import com.dbtest.database.entity.School
//import com.dbtest.db.entity.SchoolDatabse
import com.dbtest.database.relations.SchoolDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel :NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dao = SchoolDatabase.getInstance(context = this).schoolDao
        viewModel=ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(NoteViewModel::class.java)

        viewModel.notes.observe(this,{list->

            list?.let {

            }

        })

    }

    suspend fun saveSchoolToDb(dao: SchoolDao, list: List<School>) {
        for (school in list)
            dao.insertSchool(school = school)
        true
    }
}
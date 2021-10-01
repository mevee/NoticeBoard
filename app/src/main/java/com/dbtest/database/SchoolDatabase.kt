package com.dbtest.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dbtest.database.entity.*
import com.dbtest.database.relations.NoteDao
import com.dbtest.database.relations.SchoolDao

@Database(
    entities = [
        Note::class,
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class,
    ],
    version = 2,
    exportSchema = false
)
abstract class SchoolDatabase : RoomDatabase() {
    abstract val schoolDao: SchoolDao
    abstract val noteDao: NoteDao
    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_database"
                ).fallbackToDestructiveMigration()
                    .build().also {
                    INSTANCE = it
                }
            }
        }
    }

}
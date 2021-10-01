package com.dbtest.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = false)
     val studentName: String,
     val semester: Int,
     val schoolName: String
)
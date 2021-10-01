package com.dbtest.database.entity

import androidx.room.Entity

@Entity(tableName = "student_subject_cross_ref",
    primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val studentName:String,
    val subjectName:String,
)

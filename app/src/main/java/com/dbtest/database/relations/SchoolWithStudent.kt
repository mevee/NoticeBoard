package com.dbtest.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.dbtest.database.entity.School
import com.dbtest.database.entity.Student

data class SchoolWithStudent(
    @Embedded val school: School,
    @Relation(parentColumn = "schoolName",
    entityColumn = "schoolName" )
    val students:List<Student>
)

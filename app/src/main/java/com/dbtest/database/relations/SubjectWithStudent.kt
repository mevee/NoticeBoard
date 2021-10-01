package com.dbtest.database.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.dbtest.database.entity.Student
import com.dbtest.database.entity.StudentSubjectCrossRef
import com.dbtest.database.entity.Subject

data class SubjectWithStudent(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
         associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students:List<Student>

)

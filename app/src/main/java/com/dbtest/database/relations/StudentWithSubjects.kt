package com.dbtest.database.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.dbtest.database.entity.Student
import com.dbtest.database.entity.StudentSubjectCrossRef
import com.dbtest.database.entity.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(parentColumn = "studentName",
        entityColumn = "subjectName",
    associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects:List<Subject>

)

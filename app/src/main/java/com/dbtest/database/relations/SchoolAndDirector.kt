package com.dbtest.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.dbtest.database.entity.Director
import com.dbtest.database.entity.School

data class SchoolAndDirector(
    @Embedded
    val school: School,
    @Relation(parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)

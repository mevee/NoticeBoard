package com.dbtest.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "school_table")
data class School(
    @PrimaryKey(autoGenerate = false)
    val schoolName: String
)
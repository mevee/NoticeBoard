package com.dbtest.database

import com.dbtest.database.entity.Note

class Repository(val database: SchoolDatabase) {

    suspend fun getAllNotes()=database.noteDao.getAllNotes()
    suspend fun insertNote(note: Note) {
        database.noteDao.insertNote(note)
    }
}
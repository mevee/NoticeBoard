package com.dbtest.database.relations

import androidx.annotation.NonNull
import androidx.room.*
import com.dbtest.database.entity.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(@NonNull note: Note)

    @Query("SELECT * from note")
    suspend fun getAllNotes(): List<Note>

    @Transaction
    @Query("SELECT * FROM note where id=:noteId")
    suspend fun getNoteOnly(@NonNull noteId: String): Note

}
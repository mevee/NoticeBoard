package com.dbtest.database.relations

import androidx.annotation.NonNull
import androidx.room.*
import com.dbtest.database.entity.*

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(@NonNull school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(@NonNull director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(@NonNull student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(@NonNull subject: Subject)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubjectSubjectCrossRef(@NonNull crossRefrence: StudentSubjectCrossRef)

    @Query("SELECT * from student_table")
    suspend fun getAllStudents(): List<Student>

    @Query("SELECT * from school_table")
    suspend fun getAllSchool(): List<School>

    @Query("SELECT * from director_table")
    suspend fun getAllDirectors(): List<Director>

    @Transaction
    @Query("SELECT * FROM school_table where schoolName=:schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(@NonNull schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school_table where schoolName=:schoolName")
    suspend fun getSchoolWithStudents(@NonNull schoolName: String): List<SchoolWithStudent>

    @Transaction
    @Query("SELECT * FROM subject_table where subjectName=:subjectName")
    suspend fun getStudentWithSubjects(@NonNull subjectName: String): List<SubjectWithStudent>

    @Transaction
    @Query("SELECT * FROM student_table where studentName=:studentName")
    suspend fun getSubjectsOfStudent(@NonNull studentName: String): List<StudentWithSubjects>


}
package com.dbtest.ui

import androidx.lifecycle.*
import com.dbtest.database.Repository
import com.dbtest.database.entity.Note
import kotlinx.coroutines.launch

class NoteViewModel(private val repository:Repository):ViewModel() {
    private var _notes= MutableLiveData<List<Note>>()
    val notes :LiveData<List<Note>> get() = _notes

    init {
        loadNotes()
    }
    fun loadNotes(){
        viewModelScope.launch {
            _notes.postValue(repository.getAllNotes())
        }
    }

    fun saveNote(note:Note){
        viewModelScope.launch {
            repository.insertNote(note)
        }
    }

//    class Factory(private val newsService: NewsService) : ViewModelProvider.Factory {@Suppress("UNCHECKED_CAST")
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        return NewsViewModel(newsService) as T
//    }
//    }

}
package com.dbtest.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dbtest.database.Repository

class ViewModeKaladi<T>(val repository: Repository) :ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsService) as T
    }
}
package com.example.coroutinesfirebase.angel.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coroutinesfirebase.angel.domain.IUseCase

class MainViewModelFactory(val userCase: IUseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(IUseCase::class.java).newInstance(userCase)
    }
}
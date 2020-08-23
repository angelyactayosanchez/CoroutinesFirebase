package com.example.coroutinesfirebase.angel.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.coroutinesfirebase.angel.domain.IUseCase
import com.example.coroutinesfirebase.angel.vo.Resource
import com.google.rpc.context.AttributeContext
import com.squareup.okhttp.Dispatcher
import kotlinx.coroutines.Dispatchers

class MainViewModel(usecase: IUseCase) : ViewModel(){
//    override fun onCleared() {
//        super.onCleared()
//    }
    val fetchVersionCode = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
    try {
        val version = usecase.getVersionCode()
        emit(version)


    }catch (e : Exception)
    {
emit(Resource.Failure(e))
    }
}
}
package com.example.coroutinesfirebase

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coroutinesfirebase.angel.base.BaseActivity
import com.example.coroutinesfirebase.angel.data.network.RepoImp
import com.example.coroutinesfirebase.angel.domain.UseCaseImp
import com.example.coroutinesfirebase.angel.presentation.viewmodel.MainViewModel
import com.example.coroutinesfirebase.angel.presentation.viewmodel.MainViewModelFactory
import com.example.coroutinesfirebase.angel.vo.Resource

class MainActivity : BaseActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this,MainViewModelFactory(UseCaseImp(RepoImp()))).get(MainViewModel::class.java)
    }
    override fun getViewID(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeData()
    }

    private fun observeData(){
        viewModel.fetchVersionCode.observe(this, Observer {
            result ->
            when(result){
                is Resource.Loading ->{}
                is Resource.Success -> {}
                is Resource.Failure -> {}
            }
        })
    }

}
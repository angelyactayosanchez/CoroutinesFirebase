package com.example.coroutinesfirebase.angel.domain

import com.example.coroutinesfirebase.angel.vo.Resource

interface IUseCase {

    suspend fun getVersionCode() : Resource<Int>
}
package com.example.coroutinesfirebase.angel.data.network

import com.example.coroutinesfirebase.angel.vo.Resource

interface IRepo {
    suspend fun getVersionCodeRepo() : Resource<Int>
}
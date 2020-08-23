package com.example.coroutinesfirebase.angel.data.network

import com.example.coroutinesfirebase.angel.vo.Resource

class RepoImp: IRepo {
    override suspend fun getVersionCodeRepo(): Resource<Int> {
        //firebase
        return Resource.Success(2)
    }
}
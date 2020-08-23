package com.example.coroutinesfirebase.angel.domain

import com.example.coroutinesfirebase.angel.data.network.IRepo
import com.example.coroutinesfirebase.angel.vo.Resource

class UseCaseImp(private val repo: IRepo) : IUseCase{
    override suspend fun getVersionCode(): Resource<Int> = repo.getVersionCodeRepo()

}
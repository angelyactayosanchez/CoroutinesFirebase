package com.example.coroutinesfirebase.angel.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getViewID())
    }

    fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    fun hideProgress(){
        progressBar.visibility= View.INVISIBLE
    }
    protected abstract fun getViewID() : Int


}
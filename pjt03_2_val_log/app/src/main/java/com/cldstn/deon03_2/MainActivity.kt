package com.cldstn.deon03_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = "this is value1"
        val value2 = "this is value2"

        value1 = "value1 can be changed"
//        value2 = "value2 can't be changed"

        val testMsg = "test message ....."

        Log.e("MainActivityyyy", testMsg) // 오류
        Log.w("MainActivityyyy", testMsg) // 경고
        Log.i("MainActivityyyy", testMsg) // 정보
        Log.d("MainActivityyyy", testMsg) // 디버그
        Log.v("MainActivityyyy", testMsg) // 상세


        // Logcat 에 태그를 검색해서 찾아볼 수 있다.
    }
}
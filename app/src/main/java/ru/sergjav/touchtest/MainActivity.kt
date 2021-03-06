package ru.sergjav.touchtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        println("Activity dispatchTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("Activity onTouchEvent, event: ${MotionEvent.actionToString(event!!.action)}")
        return super.onTouchEvent(event)
    }
}

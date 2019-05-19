package ru.sergjav.touchtest

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.MotionEvent
import kotlinx.android.synthetic.main.content_main.*
import ru.sergjav.touchtest.custom.CustomAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = CustomAdapter()

        val decoration = DividerItemDecoration(this, layoutManager.orientation)
        decoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider)!!)
        recyclerView.addItemDecoration(decoration)


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

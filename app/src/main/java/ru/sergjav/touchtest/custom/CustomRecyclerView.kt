package ru.sergjav.touchtest.custom

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.MotionEvent

class CustomRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : RecyclerView(context, attrs, defStyle) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomRecyclerView dispatchTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomRecyclerView onTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.onTouchEvent(ev)
    }
}
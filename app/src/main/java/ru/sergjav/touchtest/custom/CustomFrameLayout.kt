package ru.sergjav.touchtest.custom

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout


class CustomFrameLayout @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr, defStyleRes) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomFrameLayout dispatchTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("CustomFrameLayout onTouchEvent, event: ${MotionEvent.actionToString(event!!.action)}")
        return super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomFrameLayout onInterceptTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.onInterceptTouchEvent(ev)
    }
}
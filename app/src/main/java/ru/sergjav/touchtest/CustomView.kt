package ru.sergjav.touchtest

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class CustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : View(context, attributeSet, defStyleAttr, defStyleRes) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomView dispatchTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        println("CustomView onTouchEvent, event: ${MotionEvent.actionToString(event!!.action)}")
        return super.onTouchEvent(event)
    }
}

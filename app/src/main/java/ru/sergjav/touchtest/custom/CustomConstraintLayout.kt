package ru.sergjav.touchtest.custom

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.MotionEvent


class CustomConstraintLayout @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attributeSet, defStyleAttr) {

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomConstraintLayout dispatchTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        println("CustomConstraintLayout onTouchEvent, event: ${MotionEvent.actionToString(ev!!.action)}")
        return super.onTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        println(
            "CustomConstraintLayout onInterceptTouchEvent, event: ${MotionEvent.actionToString(
                ev!!.action
            )}"
        )
        return super.onInterceptTouchEvent(ev)
    }
}
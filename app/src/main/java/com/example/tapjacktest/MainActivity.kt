package com.example.tapjacktest

import android.graphics.PixelFormat
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val floatingButton1 = Button(applicationContext).apply {
            alpha = 0.5f
        }

        val width = 600 //FFW width

        val height = 300 //FFW height

        val windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        val params = WindowManager.LayoutParams(
            width, height,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSPARENT
        ).apply {
            gravity = Gravity.BOTTOM
            y = 100
        }

        windowManager.addView(floatingButton1, params)

        val floatingButton2 = Button(applicationContext).apply {
            alpha = 0.5f
        }

        val params2 = WindowManager.LayoutParams(
            500, 500,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSPARENT
        ).apply {
            gravity = Gravity.CENTER
        }

        windowManager.addView(floatingButton2, params2)
    }
}

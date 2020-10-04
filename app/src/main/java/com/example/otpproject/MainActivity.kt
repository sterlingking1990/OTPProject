package com.example.otpproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mukesh.OnOtpCompletionListener
import com.mukesh.OtpView

class MainActivity : AppCompatActivity() {
    var otpView: OtpView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        otpView = findViewById(R.id.otp_view)
        otpView!!.setOtpCompletionListener {
            Log.d("onOtpCompleted=>", it)
        }
    }
}
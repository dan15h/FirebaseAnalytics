package com.danishapps.firebaseanalytic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.danishapps.firebaseanalytics.AnalyticsLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AnalyticsLib.setupAnalytics(applicationContext)
    }

    fun postAnalytics(view: View) {
        AnalyticsLib.submitAnalytic("button_clicked")
    }
}
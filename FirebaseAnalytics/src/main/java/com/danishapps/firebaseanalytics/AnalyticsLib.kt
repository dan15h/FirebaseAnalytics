package com.danishapps.firebaseanalytics

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics
import java.lang.Exception

object AnalyticsLib {
    private var mFirebaseAnalytics: FirebaseAnalytics? = null

    fun setupAnalytics(context: Context) {
        try {
            FirebaseApp.initializeApp(context)
        } catch (e: Exception) {
            Log.i("AnalyticLibLog", "failed to initialize app: ${e.message}")
        }

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context)
    }

    fun submitAnalytic(event: String) {
        val bundle = Bundle()
        bundle.putString(event, event)
        mFirebaseAnalytics?.logEvent(event, bundle)
    }
}
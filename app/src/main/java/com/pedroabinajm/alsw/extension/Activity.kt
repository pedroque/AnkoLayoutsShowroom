package com.pedroabinajm.alsw.extension

import android.app.Activity
import android.content.Intent
import android.net.Uri

private const val HOST = "anko-showroom"

fun Activity.launchDynamicActivity(schema: String) {
    launchDynamicActivity(Uri.parse("$schema://$HOST"))
}

fun Activity.launchDynamicActivity(uri: Uri) {
    val intent = resolveIntent(uri)
    require(intent != null) {
        "$uri not found"
    }
    startActivity(intent)
}

private fun Activity.resolveIntent(uri: Uri): Intent? {
    val intentToResolve = Intent(Intent.ACTION_VIEW, uri)

    val query = packageManager.queryIntentActivities(intentToResolve, 0)

    return query.firstOrNull()?.activityInfo?.let { activityInfo ->
        Intent().setClassName(activityInfo.packageName, activityInfo.name)
    }
}

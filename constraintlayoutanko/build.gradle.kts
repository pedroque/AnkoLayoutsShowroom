plugins {
    id("com.android.dynamic-feature")
    kotlin("android")
}

android {
    compileSdkVersion(SDK.VERSION)

    defaultConfig {
        minSdkVersion(SDK.MIN_VERSION)
        targetSdkVersion(SDK.TARGET_VERSION)
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":app"))
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.ankoConstraintLayout)
}

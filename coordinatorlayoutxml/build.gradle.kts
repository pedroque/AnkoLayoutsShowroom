plugins {
    id("com.android.dynamic-feature")
    kotlin("android")
    kotlin("android.extensions")
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
}

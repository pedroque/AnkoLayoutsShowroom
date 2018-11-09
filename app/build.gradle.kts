plugins {
    id("com.android.application")
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
    api(Dependencies.kotlinStdLib)

    // region anko
    api(Dependencies.ankoCommons)
    api(Dependencies.ankoSdk21)
    api(Dependencies.ankoDesign)
    api(Dependencies.ankoAppCompat)
    // endregion

    // region compat
    api(Dependencies.appCompat)
    api(Dependencies.design)
    // endregion
}

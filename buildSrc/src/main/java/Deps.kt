private const val KOTLIN = "1.3.0"
private const val ANDROID_GRADLE_PLUGIN = "3.2.1"
private const val GOOGLE_SERVICES = "3.1.1"
private const val ANKO = "0.10.6"
private const val ANDROID_SUPPORT = "28.0.0"
private const val CONSTRAINT_LAYOUT = "1.1.2"

object SDK {
    const val VERSION = 28
    const val MIN_VERSION = 21
    const val TARGET_VERSION = 28
}

object Plugins {
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN"
    val androidGradle = "com.android.tools.build:gradle:$ANDROID_GRADLE_PLUGIN"
    val googleServices = "com.google.gms:google-services:$GOOGLE_SERVICES"
}

object Dependencies {
    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$KOTLIN"
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN"
    val kotlinStdLibJDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN"
    val ankoCommons = anko("commons")
    val ankoSdk21 = anko("sdk21")
    val ankoDesign = anko("design")
    val ankoAppCompat = anko("appcompat-v7")
    val ankoConstraintLayout = anko("constraint-layout")
    val ankoRecyclerView = anko("recyclerview-v7")
    val appCompat = androidSupport("appcompat-v7")
    val design = androidSupport("design")
    val constraintLayout = "com.android.support.constraint:constraint-layout:$CONSTRAINT_LAYOUT"
    private fun anko(module: String) = "org.jetbrains.anko:anko-$module:$ANKO"
    private fun androidSupport(module: String) = "com.android.support:$module:$ANDROID_SUPPORT"
}

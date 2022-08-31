
object Project {
    object Versions {
        const val andApp = "7.2.2"
        const val andLib = "7.2.2"
        const val kotAnd = "1.7.10"
        const val kotJvm = "1.7.10"
    }
    object Plugins {
        const val comAndroidApplication = "com.android.application"
        const val comAndroidLibrary = "com.android.library"
        const val orgJetBrainsKotlinAndroid = "org.jetbrains.kotlin.android"
        const val orgJetBrainsKotlinJvm = "org.jetbrains.kotlin.jvm"
    }
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val jetBrainsKotlinAndroid = "org.jetbrains.kotlin.android"
}
object AndroidSdk {
    const val min = 21
    const val compile = 32
    const val target = compile
}
object Config {
    const val applicationId = "dev.lizarraga.groovydsltokotlindsl"
    const val versionCode = 1
    const val versionName = "1.0"
    const val jvmTarget = "1.8"
}
object Libraries {
    object Versions {
        const val ktx = "1.7.0"
        const val appCompat = "1.5.0"
        const val material = "1.6.1"
        const val constraintLayout = "2.1.4"

        const val junit = "4.13.2"
        const val extJunit = "1.1.3"
        const val espresso = "3.4.0"
    }
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
















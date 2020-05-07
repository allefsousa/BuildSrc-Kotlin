/**
 * @author allef.santos on 06/05/20
 */

private const val kotlinVersion = "1.3.50"
private const val lifecycleVersion = "2.0.0"
private const val lottie = "3.0.7"
private const val appCompat = "1.1.0"
private const val androidCore = "1.2.0"
private const val constraintLayout = "2.0.0-beta2"
private const val androidMaterial = "1.2.0-alpha05"
private const val androidLegacy = "1.0.0"
private const val koin = "2.0.1"
private const val navVersion = "2.1.0-beta02"
private const val retrofitVersion = "2.5.0"
private const val okhttpVersion = "3.12.0"
private const val okhttpVersionLoggin = "3.12.0"
private const val gsonVersion = "2.3.0"
private const val glide = "4.9.0"
private const val transitions = "1.0.1"
private const val rxAndroid = "2.1.1"
private const val rxJava = "2.1.1"
private const val rxKotlin = "2.4.0"
private const val rxBinding = "3.1.0"
private const val rxAdapter = "2.3.0"
private const val timber = "2.3.0"
private const val multidexVersion = "2.0.1"


//Test
private const val mockitoCore = "2.25.1"
private const val junitVersion = "4.12"
private const val truthVersion = "1.0"
private const val espressoVersion = "3.2.0"
private const val rulesVersion = "1.2.0"
private const val runnerVersion = "1.2.0"
private const val androidxJunitVersion = "1.1.1"
private const val kointest = "2.0.1"
private const val mockk = "1.9.1"
private const val mockitokotlin = "2.1.0"
private const val mockwebserver = "3.4.1"
private const val testng = "6.9.6"

object Config {
    object Android {
        const val minSDK = 19
        const val targetSDK = 29
        const val compileSDK = 29
        const val applicationIdHomolog = "com.developer.allef.boilerplateapp.homolog"
        const val applicationIdProduction = "com.developer.allef.boilerplateapp.homolog"
        const val versionCode = 1
        const val versionName = "0.0.0.1"
        const val PluginKotlinVersion = "1.3.61"
        const val BuildVersionGradle = "3.5.0"
    }
}

object DependenciesApp {

    val Foundation = mutableListOf(
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion",
        "androidx.appcompat:appcompat:$appCompat",
        "androidx.core:core-ktx:$androidCore",
        "com.google.android.material:material:$androidMaterial",
        "androidx.constraintlayout:constraintlayout:$constraintLayout",
        "androidx.legacy:legacy-support-v4:$androidLegacy",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion",
        "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion",
        "com.airbnb.android:lottie:$lottie",
        "org.koin:koin-android:$koin",
        "androidx.navigation:navigation-fragment-ktx:$navVersion",
        "androidx.navigation:navigation-ui-ktx:$navVersion",
        "androidx.transition:transition:$transitions",
        "com.jakewharton.timber:timber:$timber",
        "androidx.multidex:multidex:$multidexVersion"
    )

    val Networking = mutableListOf(
        "com.squareup.retrofit2:retrofit:$retrofitVersion",
        "com.squareup.retrofit2:converter-gson:$gsonVersion",
        "com.squareup.okhttp3:okhttp:$okhttpVersion",
        "com.squareup.okhttp3:logging-interceptor:$okhttpVersionLoggin",
        "io.reactivex.rxjava2:rxandroid:$rxAndroid",
        "io.reactivex.rxjava2:rxjava:$rxJava",
        "io.reactivex.rxjava2:rxkotlin:$rxKotlin",
        "com.jakewharton.rxbinding3:rxbinding:$rxBinding",
        "com.squareup.retrofit2:adapter-rxjava2:$rxAdapter"
    )

    val Image = mutableListOf(
        "com.github.bumptech.glide:glide:$glide"
    )

    object AnnotationProcessor {
        val Annotation = mutableListOf(
            "com.github.bumptech.glide:compiler:$glide"
        )
    }

    object Test {
        val supportAnnotationsExclude = "com.android.support:support-annotations"

        val AndroidTest = mutableListOf(
            "androidx.test:runner:$runnerVersion",
            "androidx.test.espresso:espresso-core:$espressoVersion",
            "androidx.test.espresso:espresso-intents:$espressoVersion",
            "androidx.test.espresso:espresso-web:$espressoVersion",
            "androidx.test:rules:$rulesVersion",
            "androidx.test.ext:junit:$androidxJunitVersion",
            "com.squareup.okhttp3:mockwebserver:$mockwebserver"
        )

        val TestKT = mutableListOf(
            "junit:junit:$junitVersion",
            "androidx.arch.core:core-testing:$lifecycleVersion",
            "com.google.truth:truth:$truthVersion",
            "org.koin:koin-test:$kointest",
            "io.mockk:mockk:$mockk",
            "com.nhaarman.mockitokotlin2:mockito-kotlin:$mockitokotlin",
            "org.mockito:mockito-core:$mockitoCore",
            "org.testng:testng:$testng"
        )
        val TestKTImplementation = mutableListOf(
            "androidx.test.espresso:espresso-idling-resource:$espressoVersion"
        )

    }


}



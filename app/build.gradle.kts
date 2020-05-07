plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Config.Android.compileSDK)
    defaultConfig {
        applicationId = Config.Android.applicationIdProduction
        minSdkVersion(Config.Android.minSDK)
        targetSdkVersion(Config.Android.targetSDK)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
        multiDexEnabled = true
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
            isTestCoverageEnabled = true
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    flavorDimensions("version")
    productFlavors {
        create("homolog") {
            applicationId = Config.Android.applicationIdHomolog
            resValue("string", "app_name", "BooilerPlate App")
            setDimension("version")
        }
        create("prod") {
            applicationId = Config.Android.applicationIdProduction
            resValue("string", "app_name", "BooilerPlate App")
            setDimension("version")
        }
    }
    bundle {
        language {
            enableSplit = true
        }
        density {
            enableSplit = true
        }
        abi {
            enableSplit = true
        }
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    DependenciesApp.Foundation.forEach { dependency ->
        implementation(dependency)
    }
    DependenciesApp.Image.forEach { dependency ->
        implementation(dependency)
    }
    DependenciesApp.AnnotationProcessor.Annotation.forEach { dependency ->
        annotationProcessor(dependency)
    }
    DependenciesApp.Test.AndroidTest.forEach { dependency ->
        androidTestImplementation(dependency)
    }
    DependenciesApp.Test.TestKT.forEach { dependency ->
        testImplementation(dependency)
    }
    DependenciesApp.Test.TestKTImplementation.forEach { dependency ->
        implementation(dependency)
    }

}
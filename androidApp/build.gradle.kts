plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.mysamplekmmapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.mysamplekmmapp.android"
        minSdk = 25
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    implementation("androidx.compose.foundation:foundation:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    implementation ("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("io.insert-koin:koin-androidx-compose:3.4.2")
    implementation("androidx.fragment:fragment-ktx:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
    implementation("io.coil-kt:coil-compose:2.3.0")

    implementation("com.google.code.gson:gson:2.10.1")

    val landscapistVersion = "2.2.1"
    implementation ("com.github.skydoves:landscapist-coil:$landscapistVersion")
    implementation ("com.github.skydoves:landscapist-transformation:$landscapistVersion")
    implementation ("com.github.skydoves:landscapist-placeholder:$landscapistVersion")

    val nav_version = "2.6.0"
    implementation("androidx.navigation:navigation-compose:$nav_version")


}
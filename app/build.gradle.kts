plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.currencyconverter"
    compileSdk = 34

    buildFeatures{
        viewBinding=true
    }

    defaultConfig {
        applicationId = "com.example.currencyconverter"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.core:core-ktx:1.12.0") // Or your desired version
    implementation("androidx.appcompat:appcompat:1.6.1") // Or your desired version
    implementation("com.google.android.material:material:1.9.0") // Or your desired version
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Or your desired version

}
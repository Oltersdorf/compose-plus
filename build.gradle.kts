plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.compose.compiler) apply false
}

allprojects {
    group = "dev.olt"
    version = "1.0.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}
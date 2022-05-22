buildscript {
    repositories {
        mavenCentral()
        google()
    }
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()

    maven {
        name = "Gradle libs"
        url = uri("https://repo.gradle.org/gradle/libs")
    }
    maven {
        name = "Gradle snapshot libs"
        url = uri("https://repo.gradle.org/gradle/libs-snapshots")
    }
    maven {
        name = "kotlinx"
        url = uri("https://dl.bintray.com/kotlin/kotlinx")
    }
    maven {
        name = "kotlin-eap"
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
    // add jcenter repository here
}

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.0")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:10.3.0")
}


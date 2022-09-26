import plugin.AndroidLibraryConfigurationPlugin

apply<AndroidLibraryConfigurationPlugin>()
apply("$rootDir/gradle/script-ext.gradle")

val version = ext.get("gitVersionName")


ext {
    set("PUBLISH_GROUP_ID", "com.gojek.courier")
    set("PUBLISH_ARTIFACT_ID", "paho")
    set("PUBLISH_VERSION", ext.get("gitVersionName"))
    set("minimumCoverage", "0.0")
}

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

dependencies {
    implementation(deps.kotlin.stdlib.core)
    implementation("com.squareup.okio:okio:3.2.0")
    testImplementation(deps.android.test.kotlinTestJunit)
    compileOnly("org.bouncycastle:bcprov-jdk15to18:1.71")
    compileOnly("org.bouncycastle:bctls-jdk15to18:1.71")
    compileOnly("org.conscrypt:conscrypt-openjdk-uber:2.5.2")
    compileOnly("org.openjsse:openjsse:1.1.10")
}

apply(from = "${rootProject.projectDir}/gradle/publish-module.gradle")

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "br.com.webmarmo"
version = "0.0.1"

application {
    mainClass.set("br.com.webmarmo.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.ktor:ktor-server-core:1.6.6")
    implementation("io.ktor:ktor-server-netty:1.6.6")
    implementation("ch.qos.logback:logback-classic:1.2.8")
}
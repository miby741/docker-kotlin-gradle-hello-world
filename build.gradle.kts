plugins {
    application
    kotlin("jvm") version "1.3.21"
    id("com.github.johnrengelman.shadow") version "4.0.4"
}

application {
    mainClassName = "MainKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}


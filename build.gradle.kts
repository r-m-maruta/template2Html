plugins {
    kotlin("jvm") version "2.3.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("org.antlr:antlr4:4.13.2")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.26.3")
    implementation("org.ow2.asm:asm:9.4")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
    from(configurations.runtimeClasspath.get().map {
        if(it.isDirectory) it else zipTree(it)
    })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}
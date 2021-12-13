plugins {
    application
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.junit-pioneer:junit-pioneer:1.5.0")
}

tasks {
    test {
        useJUnitPlatform()
    }
}

kotlin {
    jvmToolchain {
        val jdkVersion: String by project
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    }
}

application {
    mainClass.set("{{inputs.project_group_id}}.ApplicationKt")
}

tasks {
    "shadowJar"(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class) {
        isZip64 = true
    }
}
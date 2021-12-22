plugins {
    application
    id("org.jetbrains.kotlin.plugin.allopen") version "1.5.31"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

dependencies {
    testImplementation(kotlin("test"))
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

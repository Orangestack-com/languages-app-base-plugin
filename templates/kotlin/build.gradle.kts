plugins {
    kotlin("jvm") version "1.6.10"
}

allprojects {
    version = "0.0.1-SNAPSHOT"
    group = "{{inputs.project_group_id}}"

    apply { plugin("kotlin") }

    repositories {
        val artifactoryUrl: String by project
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven {
            url = uri(artifactoryUrl)
        }
    }
}

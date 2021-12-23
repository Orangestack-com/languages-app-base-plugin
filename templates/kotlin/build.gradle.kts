plugins {
    kotlin("jvm") version "1.6.10"
}

allprojects {
    version = "{{inputs.project_version}}"
    group = "{{project_group_id}}"

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

allprojects {
    version = "{{inputs.project_version}}"
    group = "{{inputs.project_group_id}}"

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
plugins {
    application
}

dependencies {
    val cdkVersion: String by project
    implementation("software.amazon.awscdk:core:$cdkVersion")
    testImplementation("software.amazon.awscdk:assertions:$cdkVersion")
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
    mainClass.set("{{inputs.project_group_id}}.{{computed_inputs.app_class_name}}Kt")
}

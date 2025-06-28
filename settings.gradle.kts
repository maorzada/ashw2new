pluginManagement {
    repositories {
        gradlePluginPortal() // ← חובה עבור kotlin plugins
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Task2"
include(":app")

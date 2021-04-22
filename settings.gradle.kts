dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        jcenter()
    }
}

rootProject.name = "freelapp-snacker"

include(":domain")
include(":android-impl")
include(":android-factory")
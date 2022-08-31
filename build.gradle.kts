// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Project.Plugins.comAndroidApplication) version Project.Versions.andApp apply false
    id(Project.Plugins.comAndroidLibrary) version Project.Versions.andLib apply false
    id(Project.Plugins.orgJetBrainsKotlinAndroid) version Project.Versions.kotAnd apply false
    id(Project.Plugins.orgJetBrainsKotlinJvm) version Project.Versions.kotJvm apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
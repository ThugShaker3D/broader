pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.kikugie.dev/releases")
        maven("https://maven.kikugie.dev/snapshots")
        maven("https://maven.fabricmc.net/")
        maven("https://maven.architectury.dev")
        maven("https://maven.neoforged.net/releases/")
    }
}
plugins {
    id("gg.meza.stonecraft") version "1.9.+"
    id("dev.kikugie.stonecutter") version "0.8.+"
}

stonecutter {
    centralScript = "build.gradle.kts"
    kotlinController = true
    shared {
        fun mc(version: String, vararg loaders: String) {
            for (loader in loaders) vers("$version-$loader", version)
        }

        mc("1.21.1", "fabric", "neoforge")
        mc("1.21.4", "fabric", "neoforge")
        mc("1.21.6", "fabric", "neoforge")
        mc("1.21.7", "fabric", "neoforge")
        mc("1.21.8", "fabric", "neoforge")
        mc("1.21.9", "fabric", "neoforge")
        mc("1.21.10", "fabric", "neoforge")
        mc("1.21.11", "fabric", "neoforge")

        // pick one as your active editing version
        vcsVersion = "1.21.11-fabric"
    }
    create(rootProject)
}

rootProject.name = "Broader"

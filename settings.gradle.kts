pluginManagement {
  includeBuild("gradle/plugins")
}
plugins {
  id("com.gradle.develocity") version "3.18.2"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.2"
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

apply(from = "$rootDir/gradle/develocity.gradle")

rootProject.name = "caffeine"
include("caffeine", "guava", "jcache", "simulator")

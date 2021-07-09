plugins {
    kotlin("js") version "1.5.10"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(npm("obsidian", "0.12.5"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            useCommonJs()
            webpackTask {
                output.libraryTarget = "commonjs"
                output.library = null
                outputFileName = "main.js"

            }
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "fintech"
include("api")
include("consumer")
include("css")
include("domain")
include("kafka")

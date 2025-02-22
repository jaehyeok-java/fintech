plugins {}

version = "0.0.1"

dependencies {
    implementation(project(":kafka"))
    implementation("org.springframework.kafka:spring-kafka:3.3.0")
    testImplementation("org.springframework.kafka:spring-kafka-test")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter-webflux")


}


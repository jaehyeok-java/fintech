plugins {}


version = "0.0.1"


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // 더 이상 springfox 호환x
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(":domain"))
    implementation(project(":kafka"))

    //TEST
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
    testImplementation("io.mockk:mockk:1.13.13")
    testImplementation("io.projectreactor:reactor-test")
    runtimeOnly("com.h2database:h2")

    //AOP
    implementation("org.springframework.boot:spring-boot-starter-aop:3.4.2")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")

    //redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis:3.4.0")



}


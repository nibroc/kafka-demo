import com.google.protobuf.gradle.*

plugins {
    id("java")
    id("com.google.protobuf") version "0.8.19"
    kotlin("jvm") version "1.6.21"
}

sourceSets {
    create("protobuf"){
        proto {
            srcDir("src/main/proto")
        }
    }
}

dependencies {
    api("com.google.protobuf:protobuf-kotlin:3.21.1")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.21.2"
    }

    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                id("kotlin")
            }
        }
    }
}

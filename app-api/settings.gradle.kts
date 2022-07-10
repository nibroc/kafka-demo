rootProject.name = "kafkademo"

// Hack to depend on the events project since there's no artifact repo for this demo
include("events")
project(":events").projectDir = File("../events")

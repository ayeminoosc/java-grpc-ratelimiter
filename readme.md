# Simple gRPC Server and Client Example in java

##How to setup
### Prerequisite
The following software should be preinstalled in your machine.
* [protocol buffer compiler 3.17.3](https://github.com/protocolbuffers/protobuf/releases)
* protoc grpc java plugin 1.38.1 [protocol-gen-grpc-java](https://github.com/grpc/grpc-java/tree/master/compiler)  
* [jdk1.8+](https://openjdk.java.net/install/)

### How To Build
run following
```shell
cd $project_dir
protoc --plugin=protoc-gen-grpc-java=$full_path_to_plugin/protoc-gen-grpc-java --java_out=src/main/java --grpc-java_out=src/main/java src/main/resources/proto/HelloService.proto
./gradlew clean build
```
#!/bin/bash
gradle clean shadowJar -p grpc-server && \
java -jar grpc-server/build/libs/grpc-server-all.jar --rt.config.location=examples/ratelimit/application.properties
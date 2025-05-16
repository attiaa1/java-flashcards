#!/bin/bash

mkdir -p build

cp -r src/resources build/

javac --module-path /opt/javafx-sdk/javafx-sdk-21/lib --add-modules javafx.controls -d build src/*.java

java --module-path /opt/javafx-sdk/javafx-sdk-21/lib --add-modules javafx.controls -cp build Main


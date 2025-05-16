#!/bin/bash

javac --module-path /opt/javafx-sdk/javafx-sdk-21/lib --add-modules javafx.controls src/Main.java
java --module-path /opt/javafx-sdk/javafx-sdk-21/lib --add-modules javafx.controls -cp src Main


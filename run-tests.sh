#!/usr/bin/env sh

mkdir -p out
CLASSPATH=".;lib/*;out"
javac -cp $CLASSPATH -d out main/*
java -cp $CLASSPATH org.junit.runner.JUnitCore main.SolutionTest


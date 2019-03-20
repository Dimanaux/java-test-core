#!/usr/bin/env sh

mkdir -p out
CLASSPATH=".;lib/*;out"
javac.exe -cp $CLASSPATH -d out main/*
java.exe -cp $CLASSPATH org.junit.runner.JUnitCore main.SolutionTest

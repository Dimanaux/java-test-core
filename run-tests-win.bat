mkdir out
set CLASSPATH=.;lib\*;out
javac -d out main\*
java org.junit.runner.JUnitCore main.SolutionTest


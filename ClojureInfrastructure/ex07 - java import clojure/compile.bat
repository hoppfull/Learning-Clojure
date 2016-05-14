@ECHO OFF

IF NOT EXIST bin mkdir bin

CALL java -cp jars/*;. clojure.main compile.clj

CALL javac -cp jars/*;src/;bin/ src/Main.java -d bin/
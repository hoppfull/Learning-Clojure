@ECHO OFF

CALL CLS

CALL java -cp ../jar/*;src/ -Djava.library.path=../native clojure.main src/main.clj
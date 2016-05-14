; Watch out for side effects? Will this work with concurrency?

(println (rand))  ; random float between 0 and less than 1
(println (rand 5))  ; random float between 0 and less than 5
(println (rand-int 5))  ; random int between 0 and less than 5
(println (rand-nth '(1 2 3 4 5)))  ; random member of list
(println (rand-nth [1 2 3 4 5]))  ; random member of vector
(println (rand-nth (seq #{:a 1 :b 2 :c 3})))  ; random member of set
(println (rand-nth (seq {"a" 1 :b 2 :c 3})))  ; random pair of hash map
(println (shuffle '(1 2 3 4 5 6 6)))
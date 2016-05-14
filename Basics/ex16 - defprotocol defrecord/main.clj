(defprotocol MyType
  (sub1 [s] "Some description1")
  (sub2 [s] "Some description2")
  (sub3 [s] "Some description3"))

(defrecord Type1 [x]
  MyType
  (sub1 [this] (+ x 1))
  (sub2 [this] (* x 15))
  (sub3 [this] (- x 2)))



(defrecord Type2 [x y]
  MyType
  (sub1 [this] (+ x y))
  (sub2 [this] (* x y 100))
  (sub3 [this] (- x y)))



(println (sub1 (->Type1 1)))  ; 2
(println (sub2 (->Type1 3)))  ; 45
(println (sub3 (->Type1 10)))  ; 8

(println (sub1 (->Type2 5 5)))  ; 10
(println (sub2 (->Type2 3 2)))  ; 600
(println (sub3 (->Type2 10 3)))  ; 7
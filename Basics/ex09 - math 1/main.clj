(def A 1e10)
(def a 1e-10)

(println A)
(println a)

; (println (* 9999 9999 9999 9999 9999))  ; error - too big numbers
(println (*' 9999 9999 9999 9999 9999))  ; produces a BigInteger
(println (bigint 5))  ; 5N
(println (bigdec 5))  ; 5M

; rational numbers:
(println (/ 1 3))  ; 1/3
(println (+ (/ 1 3) (/ 1 3)))  ; 2/3
(println (+ (/ 1 3) (/ 1 3) (/ 1 3)))  ; 1N, produces a BigInt?
(println (+ (/ 3 12) (/ 1 4)))  ; 1/2
(println (+ (/ 1 3) (/ 1 5)))  ; 8/15
(println (+ 1 (/ 1 5)))  ; 6/5
(println (+ 1.0 (/ 1 5)))  ; 1.2
(println (rationalize 0.3))  ; 3/10
(println (double (/ 1 3)))  ; 0.3333333

(println (+ 1 (Integer/parseInt "50")))
(println (+ 3 (Double/parseDouble ".14")))

(println (int 3.89))  ; 3
(println (Math/round 3.89))  ; 4
(println (Math/ceil 1.1))  ; 2.0
(println (Math/floor 1.9))  ; 1.0


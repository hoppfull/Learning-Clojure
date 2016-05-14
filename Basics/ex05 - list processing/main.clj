(def myList
  '(1 2 3 4 5))  ; ' = quote, do not evaluate list as a function named '1'

(def myVector
  [1 2 3 4 5])

(def myMap
  {'key1' 1 'key2' 2})

(def mySet
  #{1 2 3})

; http://clojure.org/sequences

(println "first:" (first myList))
(println "rest:" (rest myList))
(println "last:" (last myList))
(println "nth:" (nth myList 1))
(println "concat:" (concat '(1 2 3) '(4 5 6)))
(println "conj:" (conj '(1 2 3) 0))  ; prepend by default becouse append is slow!
(println "cons:" (cons 0 '(1 2 3)))  ; prepend by default becouse append is slow!
(println "filter:" (filter (fn [x] (<= x 2)) myList))  ; pass predicate lambda

(def xs
  '(2 3 4 5 6 5 3 1 1))
(println "distinct:" (distinct xs))

; list comprehension:
(println (for [x (range 20) :while true] x))
; another list comprehension: (Very interesting result!)
(println (for [x (range 3) y (range 3) :while true] [x y]))

(println "some 5?:" (some (fn [x] (= x 5)) xs))
(println "some 9?:" (some (fn [x] (= x 9)) xs))

(println "every? <100:" (every? (fn [x] (< x 100)) xs))
(println "every? >100:" (every? (fn [x] (> x 100)) xs))

(println "vector member acces:" (myVector 3))
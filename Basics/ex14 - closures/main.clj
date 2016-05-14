(defn myClosure [f x]
  (fn [y]
    (f x y)))


(def myFunc1 (myClosure + 5))
(def myFunc2 (myClosure * 3))

(println (myFunc1 2))  ; 7
(println (myFunc2 10))  ; 30
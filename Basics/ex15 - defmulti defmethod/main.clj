(defmulti f
  :myType)

(defmethod f :a [x]
  (+ (:x x) (:y x) 10))

(defmethod f :b [x]
  (+ (:x x) 100))

(println (f {:myType :a :x 1 :y 2}))  ; 13
(println (f {:myType :b :x 5}))  ; 105
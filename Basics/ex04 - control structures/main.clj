(def x 5)

(println
  (cond
    (< x 10) "x is less than 10"
    (> x 15) "x is greater than 15"
    :else "x is not less than 10 nor greater than 15"))

(println
  (if (< x 50)
    "x is less than 50"
    "x is not less than 50"))


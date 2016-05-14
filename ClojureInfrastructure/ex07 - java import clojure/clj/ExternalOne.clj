(ns clj.ExternalOne
  (:gen-class
   :methods [[f [int] int]]))

(defn -f [this x]  ; Why "this"...?
  (+ x 5))
(ns clj.ExternalTwo
  (:gen-class
   :methods [#^{:static true} [f [int] int]]))

(defn -f [x]
  (* x 5))
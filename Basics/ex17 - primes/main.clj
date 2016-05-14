(set! *warn-on-reflection* true)  ; Warning if you should use type hinting



(def r (doall (range 2 2000000)))
(defn isPrime [p] (JavaPrimes/isPrime p))
(defn filterPrimes [ps] (filter isPrime ps))





(defn getPrimes1 [n]  ; Returns a lazy list.
  (conj (filter #(JavaPrimes/isPrime %) (range 3 n)) 2))

(defn getPrimes2 [n]  ; This is ~15% faster than getPrimes1
  (loop [l '(2) x 2]
    (if (< x n)
      (recur (if (JavaPrimes/isPrime x) (conj l x) l) (inc x))
      l)))


(def t0 (System/nanoTime))
; (doall (getPrimes1 2000000))
; (doall (getPrimes2 2000000))
(doall (map filterPrimes r))
(def t1 (System/nanoTime))

(println "Clojure+Java time:" (int (* (- t1 t0) 1e-6)) "ms")

; 30000 samples:
; getPrimes1 12 ms
; getPrimes2 10 ms
; filterPrimes 20 ms

; 500000 samples:
; getPrimes1 116 ms
; getPrimes2 100 ms
; filterPrimes 48 ms

; 2000000 samples:
; getPrimes1 835 ms
; getPrimes2 603 ms
; filterPrimes 977 ms

; I can't really explain these values.
; A graph might help me understand it.
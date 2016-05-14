; 1000th primes is 7919!


(defn isPrime [n]
  (JavaPrimes/isPrime n))

(defn nthPrime1 [n_stop]
  (loop [p# 1 nt 2]
    (if (<= p# n_stop)
      (recur
        (if (isPrime nt) (inc p#) p#)
        (inc nt))
      (dec nt))))

(def n 600000)  ; 8960453
(time (def prime0 (nthPrime1 n)))
(println "Prime#" n ":" prime0)

(defn nthPrime [n_stop]
  (loop [p# 1 nt 2]
    (if (<= p# n_stop)
      (recur
        (if (JavaPrimes/isPrime nt) (inc p#) p#)
        (inc nt))
      (dec nt))))

(def n 600000)  ; 8960453


(future (time (def prime0 (nthPrime n)))
  (println "\nPrime0:" prime0))  ; 8960453

(future (time (def prime1 (nthPrime n)))
  (println "\nPrime1:" prime1))   ; 8960453

(future (time (def prime2 (nthPrime n)))
  (println "\nPrime2:" prime2))  ; 8960453

(future (time (def prime3 (nthPrime n)))
  (println "\nPrime3:" prime3))   ; 8960453

(future (time (def prime4 (nthPrime n)))
  (println "\nPrime4:" prime4))  ; 8960453

(future (time (def prime5 (nthPrime n)))
  (println "\nPrime5:" prime5))   ; 8960453

(future (time (def prime6 (nthPrime n)))
  (println "\nPrime6:" prime6))  ; 8960453

; (future (time (def prime7 (nthPrime n)))
  ; (println "\nPrime7:" prime7))   ; 8960453


(Thread/sleep 8000)  ; timeout
(System/exit 0)


; 1 thread: ~4700ms
; 2 thread: ~4700ms
; 3 thread: ~4700ms
; 4 thread: ~5300ms
; 5 thread: ~6600ms
; 6 thread: ~7200ms
; 7 thread: ~7700ms
; 8 thread: ~8700ms

; These results are interesting. I think multiple cores are used.
; I have 4 processor cores.
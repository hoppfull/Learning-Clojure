; Ref and Software Transactional Memory
; http://clojure.org/refs

; EXPERIMENT 1:
(def storage0 (ref '(1 2 3 4 5 6 7 8 9)))
(def storage1 (ref '()))

(defn transfer [from to]
  (dosync  ; Commits changes only if all refs are untouched during dosync!
    (when-let [item (first @from)]  ; Will not transfer if @from is empty.
      (alter from rest)
      (alter to conj item))))

(transfer storage0 storage1)
(transfer storage0 storage1)
(transfer storage0 storage1)

(println @storage0)
(println @storage1)

; EXPERIMENT 2:
(def x (ref 0))

(future
  (dosync
    (println "Atempting to increment x")
    (Thread/sleep 300)
    (alter x inc)))
    
(future
  (dosync
    (alter x inc)))

(Thread/sleep 1000)    
(println @x)

(System/exit 0)  ; Ensure exit in case we've got a thread hangin'

; Judging from these results, it looks like the dosync will not commit
; changes to a ref if there's been a change to the ref during the dosyncs
; execution.
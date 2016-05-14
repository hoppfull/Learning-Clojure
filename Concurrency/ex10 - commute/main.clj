(def x (ref 0))

(defn inc-ref [msg sleep f]
  (future
    (dosync
      (println msg)
      (Thread/sleep sleep)
      (f x inc))))

; (inc-ref "Thread1 attempting inc!" 700 alter)
; (inc-ref "Thread2 attempting inc!" 100 alter)

(inc-ref "Thread1 attempting inc!" 700 commute)
(inc-ref "Thread2 attempting inc!" 100 commute)


(Thread/sleep 1500)
(println @x)
(System/exit 0)

; Alter will rerun dosync entirely if a ref has changed during
; it's execution. Commute however will only reread the ref and
; apply it's alteration.

; Both has their advantages. Both are perfectly thread safe
; apparently.
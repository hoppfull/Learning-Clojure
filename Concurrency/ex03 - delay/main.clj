(def x (delay
  (println "Execute!")
  (println "One")
  (println "Two")
  (println "Three")
  (println "Hey-ho lets go!")
  (+ 1 2)))

(Thread/sleep 3000)

(println "get result:" (deref x))
(println "get result:" (deref x))
; deref can also be written like this:
(println "get result:" @x)

; The body of code in delay is only executed once, then
; it will cache it's return value and never change again.

; Multiple threads can safely try to have x evaluated.
; All of them will block until x is evaluated and they
; will simply retrieve the cached value.

; Not sure how the garbage collector deals with this.
(def x (future (println "tjosan!")
  (+ 1 2)))

(println @x)  ; 3
(println @x)  ; 3
(println @x)  ; 3

; The future executes its body of code right away
; in a seperate thread. I think if there are multiple
; processor cores available, they will be used. Not
; sure how well they are utilized or in what manner.

; When dereferencing x, we get the value returned by
; the future body. Like with delays, the value is
; cached and will not be calculated again.

; If a thread try to dereference x before x is
; evaluated, that thread will block until x is ready.

(def y (future (Thread/sleep 500) 3))
(def z (future (Thread/sleep 3000) 3))

(println (deref y 1000 5))  ; 3
(println (deref z 1000 5))  ; 5

; A default value can be returned by deref if future
; takes too long to evaluate. In this case threads
; will sleep for a time and return 3. If it takes
; longer than 1000ms, 5 is returned instead.

(System/exit 0)  ; Make sure program isn't left hanging.
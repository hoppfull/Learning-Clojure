(def x (promise))

(println "Trying to get value of x:")
(println "  " (deref x 1000 "Timeout 1s: x has no value (yet)!"))
(println "Does x have a value or not?" (realized? x))  ; false

; assign a value to x:
(deliver x 5)

(println "Trying to get value of x:")
(println "  " (deref x 1000 "Timeout 1s: x has no value (yet)!"))
(println "Does x have a value or not?" (realized? x))  ; true

; The promise mechanism is like initializing a variable that can
; be assigned a value at a later time. However, once this value
; has been assigned, it cannot be changed. Same rules apply for
; timeouts with deref as with futures and delays.

; If a thread is trying to deref a promise, it will either lock
; till the promise has been delivered or timeout and return a
; default value if such parameters are passed to the deref.
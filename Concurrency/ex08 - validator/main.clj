; Validator (Design Pattern?):

(def x (atom 2 :validator even?))


; (swap! x inc)  ; Error, only even numbers!

; Like the getter&setter design pattern of Java.
; Not much else to say about it.
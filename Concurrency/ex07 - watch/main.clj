; The Watch (Design Pattern?): (Sometimes just referred to as 'watches')

(defn myWatch [key identity old new]
  (do
    (println "key: " key)
    (println "identity: " identity)
    (println "old value: " old)
    (println "new value: " new)))

(def x (atom 5))

(add-watch x "whatevs" myWatch)  ; register watch from x with key "whatevs"

(swap! x inc)
(swap! x inc)

(remove-watch x "whatevs")  ; unregister watch from x with key "whatevs"

(swap! x inc)

; This is a lot like the Observer Design Pattern in OOP.
; The watch is simply a function that takes four arguments.
; The first is the key, this could be anything, but it
; identifies that particular watch with whatever reference
; it's watching.


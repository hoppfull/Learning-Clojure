(def x (atom 5))

(println (deref x))

; Atoms are interesting in that they can change. But they
; don't change their values only the values they refer to.

(swap! x #(+ % 1))

(swap! x + 1)

(swap! x inc)

(println (deref x))

(swap! x (fn [_] 3))

(println (deref x))

; atom is a mechanism for avoiding race conditions when changing
; state in a concurrent program.

; A write will block other threads trying to write to an atom.
; A deref will however never be blocked. The details seem a
; little unimportant right now.

; If multiple threads try to change an atom, there are mechanisms
; to make sure we don't get 'buggy' results.
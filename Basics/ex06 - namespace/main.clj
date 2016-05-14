(ns knatte)  ; now we're in knatte namespace

(def x 5)  ; defined in knatte namespace

(ns fnatte)  ; now we're in fnatte namespace

(println knatte/x)

(ns tjatte)  ; now we're in tjatte namespace

(println knatte/x)
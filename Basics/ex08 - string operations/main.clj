(require '[clojure.string :as str])

(println (str/capitalize "hello"))  ; Hello
(println (str/upper-case "hello"))  ; HELLO
(println (str/lower-case "AAAH"))  ; aaah

(println (str/trim "\tknatte fnatte\n"))  ; knatte fnatte
(println (str/triml "\tknatte\n"))  ; knatte\n
(println (str/trimr "\tknatte\n"))  ; \tknatte

(println (str/replace "hello" "l" "j"))  ; hejjo

(def mystring (str "a" "b" "c"))
(println mystring)  ; abc
(println (nth mystring 1))  ; b
(println (apply str ["a" "b" "c"]))

(println (interpose "-" ["a" "b" "c"]))
(println (str/join ", " ["a" "b" "c"]))
(println (seq "tjosan"))

(symbol "x")  ; string2symbol
(str 'x)  ; symbol2str
(println (name :whatevs))  ; name
(keyword "y")  ; string2keyword
(println (str :y))  ; :y

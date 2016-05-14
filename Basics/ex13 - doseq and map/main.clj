(doseq [i '("a" "b" "c" "d")] (println i))

(println(map (fn [i] (* i 2)) '(1 2 3 4)))
(println(map #(* % 2) '(1 2 3 4)))
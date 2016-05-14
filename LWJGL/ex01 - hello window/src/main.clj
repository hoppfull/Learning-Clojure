(ns main)
(load "graphics/window")

; A handle for closing program remotely (such as from input)
(def close? (atom false))

; Mechanism to simulate a remote close request:
(future
  (Thread/sleep 1000)
  (swap! close? not))

; Function to call each render frame:
(defn render []
  (println "tjosan"))

; Deref prevents program terminating before thread is finished:
@(window/renderThread close? render)
(System/exit 0)  ; Terminate program

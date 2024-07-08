(ns cisp.cisp
  (:gen-class)
  (:require [clojure.math :as math]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (first args)))

(defn circumference
  [radius]
  (* (* 2 math/PI) radius))

(defn circle-area
  [radius]
  (* math/PI radius radius))

(defn deg->rad
  [deg]
  (* deg (/ math/PI 180)))

(def square
  #(* % %))

(circumference 4)
;; => 25.132741228718345
(circle-area 4)
;; => 50.26548245743669
(deg->rad 45.0)
;; => 0.7853981633974483
(square 2)
;; => 4

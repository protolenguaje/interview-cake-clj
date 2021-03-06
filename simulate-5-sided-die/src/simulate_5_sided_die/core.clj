(ns simulate-5-sided-die.core
  (:gen-class))

(defn- random [floor ceiling]
  (+ floor (rand-int (inc (- ceiling floor)))))

(defn- rand7 []
  (random 1 7))

(defn rand5 []
  (loop [rand (rand7)]
    (if (<= rand 5)
      rand
      (recur (rand7)))))

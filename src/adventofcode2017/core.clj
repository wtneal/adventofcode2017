(ns adventofcode2017.core
  (:gen-class))

(defn day1
  "Solving a captcha"
  [input]
  ;; split the number to a string
  (let [in (map #(Character/digit % 10) (str input))]
    ;; sum
    (reduce +
            ;; the first digit in each pair of adjacent digits
            (map first
                 ;; only if they are the same
                 (filter #(apply = %)
                         (map vector
                              in
                              ;; offset the list where the last item will wrap to the first
                              (conj (into [] (rest in)) (first in))))))))

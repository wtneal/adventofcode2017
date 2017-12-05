(ns adventofcode2017.core
  (:gen-class))

(defn day1a
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

(defn day1b
  "
  Sum all the digits that meet the following condition: If the
  current digit and the digit halfway around the circular list
  is the same then 
  "
  [input]
  (let [in (map #(Character/digit % 10) (str input))
        offset (/ (count in) 2)]
    ;; sum
    (reduce +
            ;; the first digit in each pair of adjacent digits
            (map first
                 ;; only if they are the same
                 (filter #(apply = %)
                         (map (fn [[idx value]]
                                [value (nth in (mod (+ idx offset) (count in)))]) (map-indexed vector in)))))))

(defn- process-line
  [line]
  (let [xs (map #(Integer/parseInt %)
                (clojure.string/split line #" "))]
    [(min xs) (max xs)]))


(defn day2a
  "
  Calculate a checksum. The checksum is the sum of the
  difference between the smallest and largest number of
  each row
  "
  [input]
  (let [min-maxes (map process-line (clojure.string/split-lines input))]
    (reduce (fn [[min-val max-val] & args] (apply + (conj args (- max-val min-val))))
            min-maxes)))
            

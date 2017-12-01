(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.core :refer :all]))

(deftest day1-test
  (testing "Testing Day 1"
    (is (= (day1 1122) 3))
    (is (= (day1 1111) 4))
    (is (= (day1 1234) 0))
    (is (= (day1 91212129) 9))))

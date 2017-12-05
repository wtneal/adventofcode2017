(ns adventofcode2017.core-test
  (:require [clojure.test :refer :all]
            [adventofcode2017.core :refer :all]))

(deftest day1a-test
  (testing "Testing Day 1"
    (is (= (day1a 1122) 3))
    (is (= (day1a 1111) 4))
    (is (= (day1a 1234) 0))
    (is (= (day1a 91212129) 9))))

(deftest day1b-test
  (testing "Testing Day 1"
    (is (= (day1b 1212) 6))
    (is (= (day1b 1221) 0))
    (is (= (day1b 123425) 4))
    (is (= (day1b 123123) 12))
    (is (= (day1b 12131415) 4))))


(deftest day2a-test
  (testing "Testing Day 1"
    (is (= (day2a "5 1 9 5\n7 5 3\n2 4 6 8") 18))))

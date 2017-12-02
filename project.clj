(defproject adventofcode2017 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2017 Solutions"
  :url "https://github.com/wtneal/adventofcode2017"
  :license {:name "MIT License"
            :url "https://mit-license.org"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [enlive "1.1.6"]
                 [clj-http "3.7.0"]]
  :main ^:skip-aot adventofcode2017.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

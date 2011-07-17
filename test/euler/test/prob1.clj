(ns euler.test.prob1
  (:use [euler.prob1])
  (:use [clojure.test]))

(deftest is-multiple
  (is (is-multiple? 6 1) "Multiple of 1")
  (is (not (is-multiple? 6 4)) "Not-multiple 6 of 4")
)

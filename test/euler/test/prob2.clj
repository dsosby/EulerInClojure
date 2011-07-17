(ns euler.test.prob2
  (:use [euler.prob2])
  (:use [clojure.test]))

(deftest prob2tests
  (is (= (get-sum 10) 10) "Even fibs to 10")
  (is (= (get-sum 4000000) 4613732) "Even fibs to 4 million")
)


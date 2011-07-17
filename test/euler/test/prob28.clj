(ns euler.test.prob28
  (:use [euler.prob28])
  (:use [clojure.test]))

(deftest get-diagonals
  (is (= (get-diagonals-for-square 1) '(1)) "Diagonals of square 1")
  (is (= (get-diagonals-for-square 5) '(25 21 17 13)) "Diagonals of square 5")    ;I really should make this independent of order
)

(deftest check-results
  (is (= (sum-diagonals-on-spiral 1) 1) "Sum of diagonals s=1")
  (is (= (sum-diagonals-on-spiral 5) 101) "Sum of diagonals s=5")
  (is (= (sum-diagonals-on-spiral 1001) 669171001) "Sum of diagonals s=1001")
)


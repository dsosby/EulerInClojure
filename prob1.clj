;Project Euler Problem 1
;Return the sum of all unique multiples of 3 and 5 up to 1000
;This version uses loop to make the single-recursive-function "easier" to read
;This version does hide the fact that you can set the starting sum and adder and also allows for a doc string

(defn is-multiple? [x y]
  (zero? (mod x y)))

(defn sum-it-up
  [max]
  (loop [sum 0 adder 1]
    (if (< adder max)
      (let [mult3 (is-multiple? adder 3)
            mult5 (is-multiple? adder 5)
            sumadder (if (or mult3 mult5) adder 0)]
        (recur (+ sum sumadder) (inc adder)))
      sum)))

(time (println "Result=" (sum-it-up 1000))) 

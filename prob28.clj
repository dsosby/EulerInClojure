;Project Euler - Problem 28
;The sum of a diagonals in a spiraling number square
;Examining the example 5x5 cube, a pattern emerges:
; 1 (+2) 3 (+2) 5 (+2) 7 (+2) 9 (+4) 13 (+4) 17....
;So, we start at 1 and the incrementer is 2. Do that 4 times,
;then add 2 to the incrementer. Go 4 times, (+ incr 2), ...

;So, with the pattern found, we can generate a lazy sequence
;and sum everything up

(defn get-diagonals-for-square
  [size]
  (if (= size 1) (list 1)
    (let [top (* size size)
          decrement (- (- size 1))
          bottom (- (+ top (* decrement 3)) 1)]
        (range top bottom decrement))))

(defn sum-diagonals-on-spiral
  [size]
  (loop [cursum 0 sides (filter odd? (range (inc size)))]    ;squares are odd sizes
    (if (empty? sides) cursum
      (recur (+ cursum (reduce + (get-diagonals-for-square (first sides)))) (rest sides)))))

(time (println "Result=" (sum-diagonals-on-spiral 1001)))

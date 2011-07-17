(ns euler.prob28)

;Project Euler - Problem 28
;Breaking this problem down, we can see that we want to
;be able to grab the diagonals for each square and sum 
;those. The get-diagonals-for-square returns a list of
;numbers representing the corners of a square that size,
;using the basic pattern set for (top-right corner is the
;square of its size, and if we know that we can subtract
;the sides 3 times to get the previous corners)
;We call this function for each square up to the specified
;size. Note that each square is an odd size.

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

;(time (println "Result=" (sum-diagonals-on-spiral 1001)))

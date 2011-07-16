;Project Euler - Problem 2
;Sum all even Fibonacci numbers < 4000000

(defn even-fibonnaci
  {:doc "Generate a lazy sequence of even Fibonacci numbers less than [max]"}
  ([max] (even-fibonnaci 1 0 max))
  ([cur prev max]
    (let [fib (+ cur prev)]
      (if (< fib max)
        (if (even? fib)
          (lazy-seq (cons fib (even-fibonnaci fib cur max)))
          (recur fib cur max))
        nil))))

(time (println "Result=" (reduce + (even-fibonnaci 4000000))))


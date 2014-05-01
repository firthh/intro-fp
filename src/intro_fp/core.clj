(ns intro-fp.core)



(def a 1)

;;a

(defn foo [] "hello")

;;(def foo2 (fn [] "hello"))

;;foo

;;(foo)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn greeter [name]
  (fn [other-name]
    (str "Hello " other-name " I am " name)))


;;(def hugos-greeter
;; (greeter "Hugo"))

;;hugos-greeter

;;(hugos-greeter "Bill")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn multiply-by-2 [n]
  (* n 2))

;;(multiply-by-2 2)

;;(multiply-by-2 1024)

(def our-array '(1, 2, 3, 4, 5))

;;(map multiply-by-2 our-array)

;;(def our-doubled-numbers
;;  (map multiply-by-2 our-array))

;;our-array

;;(defn add-ten [n]
;;  (+ 10 n))

;;(map add-ten our-array)

;;our-array

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;(even? 2)

;;(even? 3)

;;(filter even? our-array)

;;our-array

;;(def our-even-numbers
;;  (filter even? our-array))

;;our-even-numbers

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;(defn sum [accumulator number]
;;  (+ accumulator number))

;;(sum 0 1)

;;(sum 2 3)

;;(reduce sum our-array)

;;(reduce + our-array)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn square [num]
  (* num num))

(defn div-by-5? [num]
  (= 0 (mod num 5)))

(defn sqr-div-by-5? [num]
  (-> num
      square
      div-by-5?))

;;(sqr-div-by-5? 5)

;;(sqr-div-by-5? 10)


;;(sqr-div-by-5? 2)

;;(sqr-div-by-5? 3)

;;(range)

;;(take 10 (range))

(def sum-of-first-10
  (->> (range)
       (filter sqr-div-by-5?)
       ;;(take 10)
       ;;(reduce +)
       ))

;;sum-of-first-10


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn sum-of-first [x]
  (->> (range)
       (filter sqr-div-by-5?)
       (take 10)
       (reduce +)))


;;(sum-of-first 10)

(defn read-then-store-numbers []
  (-> (slurp "/Users/hugo/Documents/Work/intro-fp/numbers.txt")
      sum-of-first
      str
      (#(spit "/Users/hugo/Documents/Work/intro-fp/out.txt" %))))


;;(read-then-store-numbers)























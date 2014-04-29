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







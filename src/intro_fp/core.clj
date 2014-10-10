(ns intro-fp.core)

;; (def a 1)
;; a

;; (def hugo-string "hugo")
;; hugo-string

;; (def hugo-keyword :hugo-firth)
;; hugo-keyword

;; (def hugo-vector ["hugo" "firth"])
;; (first hugo-vector)

;; (def hugo-map
;;   {
;;    :name "hugo"
;;    :last-name "firth"
;;    })

;; (defn foo [] "hello")

;; foo

;; (foo)

;; (defn foo2 [name]
;;   (str "hello " name))

;; (foo2 "hugo")


;; "It is better to have 100 functions operate on one data structure than to have 10 functions operate on 10 data structures." - Alan J. Perlis








;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; higher order functions

;; ;; funtion that takes a function

;; (defn sum [number1 number2]
;;  (+ number1 number2))
;; (sum 1 3)

;; (defn do-fun [fun]
;;  (fun 1 1 1 1))

;; (do-fun +)
;; (+ 1 1 1 1)

;; (do-fun -)
;; (- 1 1 1 1)

;; (do-fun str)
;; (str 1 1 1 1)


;; dynamic typing means we can pass anything to that function
;; (do-fun sum)
;; (do-fun 1)


;; example for the refactoring dojo

;; (defn positive? [num]
;;   (> num 0))
;; (defn negative? [num]
;;   (> num 0))

;; (defn counter [func col]
;;   (count (filter func col)))


;; (counter even? [1 2 3 4 5 6 7 8 9 10])
;; (counter odd? [1 2 3 4 5 6 7 8 9 10])
;; (counter positive? [-1 -2 -3 -4 -5 6 7 8 9 10])
;; (counter negative? [-1 -2 -3 -4 -5 6 7 8 9 10])






;; ;; function that returns a function

;; (defn greeter [name]
;;  (fn [other-name]
;;    (str "Hello " other-name " I am " name)))

;; (def hugos-greeter
;;   (greeter "Hugo"))

;; hugos-greeter

;; (hugos-greeter "Bill")

;; ;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; map - higher order function

;; (defn multiply-by-2 [n]
;;  (* n 2))

;; (multiply-by-2 2)

;; (multiply-by-2 1024)

;; (def our-array [1 2 3 4 5])

;; (map multiply-by-2 our-array)

;; (def our-doubled-numbers
;;   (map multiply-by-2 our-array))

;; our-array

;; (defn add-ten [n]
;;  (+ 10 n))

;; (map add-ten our-array)

;; our-array

;; ;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; filter - higher order function

;; (even? 2)

;; (even? 3)

;; (filter even? our-array)

;; our-array

;; (def our-even-numbers
;;  (filter even? our-array))

;; our-even-numbers

;; ;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; reduce - higher order function

;; (defn sum [accumulator number]
;;  (+ accumulator number))

;; (sum 0 1)

;; (sum 2 3)

;; (reduce sum 0 our-array)

;; (reduce + 0 our-array)

;; ;; MAX

;; (defn max [number1 number2]
;;  (if (> number1 number2)
;;    number1
;;    number2))

;; (reduce max our-array)

;; ;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; declerative programming - composition


;; (defn square [num]
;;   (* num num))

;; (square 5)

;; (defn div-by-5? [num]
;;   (= 0 (mod num 5)))

;; (div-by-5? 6)

;; (defn sqr-div-by-5? [num]
;;   (div-by-5? (square num)))

;; (sqr-div-by-5? 5)

;; (sqr-div-by-5? 10)


;; (sqr-div-by-5? 2)

;; (sqr-div-by-5? 3)

;; (range)

;; (take 10 (range))

;; (def sum-of-first-1
;;   (->> (range)
;;        (filter sqr-div-by-5?)
;; ;;        (take 10)
;; ;;        (reduce +)
;; ))

;;   sum-of-first-10

;; concurrency

;; (defn long-op [x] (Thread/sleep 10) x)
;; (def nums (take 1000 (range)))

;; (time (doall (map long-op nums)))
;; (time (doall (pmap long-op nums)))












(ns intro-fp.core)

;; (def a 1)
;; a

;; (def hugo-string "hugo")
;; hugo-string

;; (defn foo [] "hello")

;; foo

;; (foo)

;; (defn foo2 [name]
;;   (str "hello " name))

;; foo2
;; (foo2 "hugo")

;; (def dic-obj
;;   {"name" "hugo"
;;    "location" "Kampala"})

;; dic-obj
;; (get dic-obj "name")

;; ;; "It is better to have 100 functions operate on one data structure than to have 10 functions operate on 10 data structures." - Alan J. Perlis








;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; higher order functions

;; ;; funtion that takes a function

;; (defn sum [number1 number2]
;;   (+ number1 number2))

;; (sum 1 3)

;; (defn do-fun [fun]
;;   (fun 1 1 1 1))

;; (do-fun +)
;; (+ 1 1 1 1)

;; (do-fun -)
;; (- 1 1 1 1)

;; (do-fun str)
;; (str 1 1 1 1)


;; ;; dynamic typing means we can pass anything to that function
;; (do-fun sum)
;; (do-fun 1)


;; ;; function that returns a function

;; (defn greeter [name]
;;   (fn [other-name]
;;     (str "Hello " other-name " I am " name)))
;; greeter

;; (def hugos-greeter
;;   (greeter "Hugo"))

;; hugos-greeter

;; (hugos-greeter "Bill")

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; map - higher order function

;; (defn multiply-by-2 [n]
;;   (* n 2))

;; (multiply-by-2 2)

;; (multiply-by-2 1024)

;; (def our-array [1 2 3 4 5])

;; (map multiply-by-2 our-array)

;; (def our-doubled-numbers
;;   (map multiply-by-2 our-array))

;; our-array

;; (defn add-ten [n]
;;   (+ 10 n))

;; (map add-ten our-array)

;; our-array

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; filter - higher order function

;; (even? 2)

;; (even? 3)

;; (filter even? our-array)

;; (def our-even-numbers
;;   (filter even? our-array))

;; our-even-numbers

;;  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; reduce - higher order function

;; (defn sum [accumulator number]
;;   (+ accumulator number))

;; (sum 0 1)

;; (sum 2 3)

;; (reduce sum 0 our-array)

;; (reduce + 0 our-array)

;; ;; ;; MAX

;; (defn max [number1 number2]
;;   (if (> number1 number2)
;;     number1
;;     number2))

;; (reduce max our-array)

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
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

;; (range 1000)

;; (take 10 (range))

;; (def sum-of-first-10
;;   (->> (range)
;;        (filter sqr-div-by-5?)
;; ;;        (take 10)
;; ;;        (reduce +)
;;        ))

;; sum-of-first-10

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ;; Laziness

;; (take 5 (range))

;; (take 10 (drop 5 (range)))

;; (take 5 (repeat 5))


;; (take 10 (drop 1 (cycle [:a :b :c :d :e :f :g])))

;; (def alphabet "abcdefghijklmnopqrstuvwxyz")

;; (defn offset [coll amount]
;;   (take (count coll) (drop amount (cycle coll))))

;; (offset (range 100) 95)
;; (offset (range 100) 50)

;; (apply str (offset alphabet 3))
;; (apply str (offset alphabet 10))

;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; ;; Immutibility

;; ;; Simple values
;; (def x 1)

;; x

;; (inc x)

;; x

;; ;; Collections

;; (def num-array [1 2 3 4 5])
;; (map inc num-array)
;; num-array

;; ;; Access to Java Collections

;; (def java-list
;;   (java.util.ArrayList. [1 2 3]))

;; (map inc java-list)
;; java-list

;; (.get java-list 0)
;; (.set java-list 0 2)
;; java-list

;; ;; Dictionaries

;; (def me {:name "Hugo" :location "Kampala"})
;; (:name me)
;; (assoc me :name "Hugo Firth")
;; me
;; (:name me)



;; ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; ;; Concurrency

;; (defn long-op [x] (Thread/sleep 10) x)
;; (def nums (take 1000 (range)))

;; (time (doall (map long-op nums)))
;; (time (doall (pmap long-op nums)))

;; ;; Futures

;; (def f (future (Thread/sleep 10000) (println "finished sleeping time to return") 100))
;; (Thread/sleep 100)
;; (* 10 1289309)
;; (inc 1)
;; f
;; @f

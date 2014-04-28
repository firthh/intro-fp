(ns intro-fp.core)



(def a 1)

;;a

(defn foo [] "hello")

;;(def foo (fn [] "hello"))

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


(defn multiply-by-2 [x]
  (* x 2))

;;(multiply-by-2 2)

;;(multiply-by-2 1024)

(def our-array '(1, 2, 3, 4, 5))

;;(map multiply-by-2 our-array)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

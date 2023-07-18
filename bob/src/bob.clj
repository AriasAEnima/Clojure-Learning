(ns bob 
  (:require [clojure.string :as str]))

(defn response-for [s] ;; <- arglist goes here
  (cond
    (and (= (.lastIndexOf s "?")  (- (count s) 1)) (= (str/upper-case s) s) (not= (str/lower-case s) s) ) "Calm down, I know what I'm doing!"
    (and (= (.lastIndexOf (str/trim s) "?")  (- (count (str/trim s)) 1)) (> (count (str/trim s)) 0) ) "Sure."
    (and (not= (str/lower-case s) s) (= (str/upper-case s) s) ) "Whoa, chill out!" 
    (= (str/trim s) "") "Fine. Be that way!" 
    :else "Whatever.")
)

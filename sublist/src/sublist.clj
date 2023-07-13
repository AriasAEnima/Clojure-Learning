(ns sublist)
(defn contains [a b]
  (let [size-a (count a), size-b (count b)]
    (if
     (< size-b size-a) false
     (if (= a (take size-a b)) true
         (recur a (rest b))))))


(defn classify [list1 list2] ;; <- arglist goes here 
  (cond (= list1 list2) :equal
        (contains list2 list1) :superlist
        (contains list1 list2) :sublist
        :else :unequal))

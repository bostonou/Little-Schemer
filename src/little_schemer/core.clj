(ns little-schemer.core)

(defn atom?
  [a]
  (not (list? a)))

(defn lat?
  [lat]
  (cond
    (atom? lat) false
    (empty? lat) true
    (list? (first lat)) false
    true (lat? (rest lat))))

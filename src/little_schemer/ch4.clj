(ns little-schemer.ch4)

(defn occur
  [a lat]
  (cond
    (empty? lat) 0
    (= (first lat) a) (+ 1 (occur a (rest lat)))
    ;(= (first lat) a) (+ 1 0)))
    true (occur a (rest lat))))

(defn one?
  [n]
  (= n 1))

(defn rempick
  [n lat]
  (cond
    (empty? lat) ()
    (= n 1) (rest lat)
    true (cons (first lat) (rempick (- n 1) (rest lat)))))

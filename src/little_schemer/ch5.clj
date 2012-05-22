(ns little-schemer.ch5)

(defn rember*
  [a lat]
  (let [[first & rest] lat]
    (cond
      (empty? lat) ()
      (= a first) (rember* a rest)
      (list? first) (cons (rember* a first) (rember* a rest))
      true (cons first (rember* a rest)))))

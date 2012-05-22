(ns little-schemer.ch5)

(defn rember*
  [a lat]
  (let [[first & rest] lat]
    (cond
      (empty? lat) ()
      (= a first) (rember* a rest)
      (list? first) (cons (rember* a first) (rember* a rest))
      true (cons first (rember* a rest)))))

(defn insertR*
  [insert old lat]
  (let [[first & rest] lat]
    (cond
      (empty? lat) ()
      (= old first) (list* old insert (insertR* insert old rest))
      (list? first) (cons (insertR* insert old first)
                          (insertR* insert old rest))
      true (cons first (insertR* insert old rest)))))

(ns little-schemer.test.ch4
  (:use [little-schemer.ch4])
  (:use [clojure.test]))

(deftest occur-test
  (is (= 0 (occur 'a '(1 2 3))))
  (is (= 1 (occur 'b '(b 2 3))))
  (is (= 1 (occur 'c '(1 c 3))))
  (is (= 3 (occur 'd '(d d d)))))

(deftest one?-test
  (is (one? 1))
  (is (not (one? 'a)))
  (is (not (one? 0))))

(deftest rempick-test
  (let [lat '(lemon meringue salty pie)]
    (is (= (rempick 1 lat) '(meringue salty pie)))
    (is (= (rempick 2 lat) '(lemon salty pie)))
    (is (= (rempick 3 lat) '(lemon meringue pie)))
    (is (= (rempick 4 lat) '(lemon meringue salty)))))

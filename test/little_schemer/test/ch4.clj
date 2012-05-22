(ns little-schemer.test.ch4
  (:use [little-schemer.ch4])
  (:use [clojure.test]))

(deftest occur-test
  (is (= 0 (occur 'a '(1 2 3))))
  (is (= 1 (occur 'b '(b 2 3))))
  (is (= 1 (occur 'c '(1 c 3))))
  (is (= 3 (occur 'd '(d d d)))))

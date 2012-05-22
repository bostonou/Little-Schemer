(ns little-schemer.test.core
  (:use [little-schemer.core])
  (:use [clojure.test]))

(deftest atom?-test
  (is (= true (atom? 'a)))
  (is (= true (atom? :b)))
  (is (= true (atom? 2)))
  (is (= false (atom? '(a)))))

(deftest lat?-test
  (is (= true (lat? ())))
  (is (= true (lat? '(a b c d e))))
  (is (= false (lat? 'a)))
  (is (= false (lat? '(a (b) c d e)))))

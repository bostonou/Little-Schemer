(ns little-schemer.test.ch5
  (:use [little-schemer.ch5])
  (:use [clojure.test]))

(deftest rember*-test
  (is (= (rember* 'cup '((coffee) cup ((tea) cup) (and (hick)) cup))
         '((coffee) ((tea)) (and (hick)))))
  (is (= (rember* 'sauce
                  '(((tomato sauce)) ((bean) sauce) (and ((flying)) sauce)))
         '(((tomato)) ((bean)) (and ((flying)))))))

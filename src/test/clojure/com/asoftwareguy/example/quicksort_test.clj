(ns com.asoftwareguy.example.quicksort_test
  (:require [clojure.test :refer :all ]
            [com.asoftwareguy.example.quicksort :refer :all ]
            )
  )

(deftest quicksort-test
  (testing "quicksort of 13 number list"
    (is (= (quicksort [23,87,22,5,354,67,456,7,1,34,45,45,1]) [1 1 5 7 22 23 34 45 45 67 87 354 456]))
    )
  )

(run-tests 'com.asoftwareguy.example.quicksort_test)
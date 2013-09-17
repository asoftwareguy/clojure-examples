(ns com.asoftwareguy.example.average_test
  (:require [clojure.test :refer :all ]
            [com.asoftwareguy.example.average :refer :all ]
            )
  )

(deftest average-test-two-numbers
  (testing "average of 3 and 5 is 4"
    (is (= (average 3 5) 4))
    )
  )

(deftest average-test-five-numbers
  (testing "average of 3,5,7,9 and 11 is 7"
    (is (= (average 3 5 7 9 11) 7))
    )
  )

(run-tests 'com.asoftwareguy.example.average_test)
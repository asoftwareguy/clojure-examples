(ns com.asoftwareguy.example.addx_test
  (:require [clojure.test :refer :all ]
            [com.asoftwareguy.example.addx :refer :all ]
            )
  )

(deftest addx-map-test
  (testing "map addx 5 to list [1 2 3 4 5] should return [6 7 8 9 10]"
    (is (= (map (addx 5) [1 2 3 4 5]) [6 7 8 9 10]))
    )
  )

(run-tests 'com.asoftwareguy.example.addx_test)
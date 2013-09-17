(ns com.asoftwareguy.example.average)

(defn average [& args] (/ (apply + args) (alength (to-array args))))
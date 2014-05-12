(ns leiningen.findarg
  (:use [clojure.string :only [join]]
        findfn.core))

(defn ^:no-project-needed findarg
  "Find a function to pass to a higher order function to get a specific output value.

Example: lein find-arg map % [1 2 3] [2 3 4]"
  [_project & args]
  (if-let [names (seq (apply find-arg [] (read-arg-string (join " " args))))]
    (doseq [x names]
      (prn x))
    (println "Nothing was found.")))

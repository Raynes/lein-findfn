(ns leiningen.findfn
  (:use findfn.core
        [clojure.string :only [join]]))

(defn ^:no-project-needed findfn
  "Find a var

Pass the inputs followed by the expected output."
  [_project & args]
  (if-let [names (seq (apply find-fn [] (read-arg-string (join " " args))))]
    (doseq [x names]
      (prn x))
    (println "Nothing was found.")))

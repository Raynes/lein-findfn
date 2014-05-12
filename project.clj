(defproject lein-findfn "0.1.1-SNAPSHOT"
  :description "Find things."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [findfn "0.1.3"]]
  :jvm-opts ["-Djava.security.policy=example.policy"]
  :eval-in-leiningen true)

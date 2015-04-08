(defproject org.clojars.toxi/clutch "0.5.0-SNAPSHOT"
  :description "A Clojure library for Apache CouchDB."
  :url "https://github.com/clojure-clutch/clutch/"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [clj-http "1.1.0"]
                 [cheshire "5.4.0"]
                 [commons-codec "1.10"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/clojurescript "0.0-3165" :optional true
                  :exclusions [com.google.code.findbugs/jsr305
                               com.googlecode.jarjar/jarjar
                               junit
                               org.apache.ant/ant
                               org.json/json
                               org.mozilla/rhino]]]
  :min-lein-version "2.0.0"
  :test-selectors {:default #(not= 'test-docid-encoding (:name %))
                   :all (constantly true)})

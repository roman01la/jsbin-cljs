(defproject jsbin "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.28"]]

  :plugins [[lein-cljsbuild "1.0.6"]]
  :hooks [leiningen.cljsbuild]

  :source-paths ["src" "target/classes"]

  :cljsbuild
  {:builds {
     :dev {
       :source-paths ["src/jsbin"]
       :compiler {:optimizations :none
                  :main jsbin.core
                  :dump-core false
                  :source-maps true
                  :verbose true
                  :output-to "out/cljs-jsbin.js"}}

     :release {
       :source-paths ["src/jsbin"]
       :compiler {:optimizations :simple
                  :pretty-print false
                  :dump-core false
                  :static-fns true
                  :optimize-constants true
                  :verbose true
                  :output-to "out/cljs-jsbin.js"}}}})

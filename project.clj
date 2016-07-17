(defproject jsbin-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure       "1.8.0"]
                 [org.clojure/clojurescript "1.9.89"]
                 [replumb                   "0.2.1"]]

  :plugins [[lein-cljsbuild "1.1.1"]]
  :hooks [leiningen.cljsbuild]

  :source-paths ["src" "target/classes"]

  :cljsbuild
  {:builds {
            :dev {
                  :source-paths ["src/jsbin-cljs"]
                  :compiler {:optimizations :none
                             :main jsbin-cljs.core
                             :source-maps true
                             :verbose true
                             :asset-path "target/cljsbuild-compiler-0"
                             :output-to "out/jsbin-cljs.js"}}

            :release {
                      :source-paths ["src/jsbin-cljs"]
                      :compiler {:optimizations :simple
                                 :pretty-print false
                                 :static-fns true
                                 :optimize-constants true
                                 :verbose true
                                 :output-to "out/jsbin-cljs.js"}}}})

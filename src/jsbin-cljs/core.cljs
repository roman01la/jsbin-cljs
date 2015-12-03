(ns jsbin-cljs.core
  (:require [cljs.js :as cljs]))

(enable-console-print!)

(defn ^:export eval [source-str callback]
  (cljs/eval-str (cljs/empty-state)
                 source-str nil
                 {:eval cljs/js-eval
                  :context :expr
                  :def-emits-var true
                  :source-map true}
                 (fn [{:keys [error value]}]
                   (if-not error
                     (callback nil value)
                     (callback error)))))

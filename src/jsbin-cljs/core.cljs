(ns jsbin-cljs.core
  (:require [replumb.core :as replumb]))

(defn ^:export eval [src-str callback]
  (replumb/read-eval-call {:verbose false
                           :warning-as-error false
                           :target :browser
                           :context :statement}
                          (fn [{:keys [success? error value]}]
                           (if success?
                             (callback nil value)
                             (callback (.. error -cause))))
                          src-str))

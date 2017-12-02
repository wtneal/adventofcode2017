(ns adventofcode2017.util
  (:require [clj-http.client :as client]
            [net.cgrand.enlive-html :as html]))

(defn get-token
  [resp]
  (-> (:body)
      (html/snippet)
      (html/select [[:input (html/attr= :name "authenticity_token")]])
      (get-in [:attrs :value])))

(defn login
  [user pass]
  (let [resp (client/get "https://adventofcode.com/auth/github")
        token (get-token resp)]
  (client/post "https://github.com/sesson"
               {:form-params {:authenticity_token token
                              :commit "Sign+in"
                              :login user
                              :password pass
                              :utf8 "\u2713"}}))

(defn build-url
  [day]
  (str "http://adventofcode.com/2017/day/" day "/input"))

(defn scrape-input
  [day]
  (client/get (build-url day)))

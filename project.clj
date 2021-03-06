(defproject compojure-api-chassis/lein-template "0.1.3"
  :description "A compojure-api chassis with mount, omniconf, buddy and metrics-clojure,
  optionally with postgres/hikari/migratus, selmer and friend-oauth2"
  :url "https://github.com/mping/compojure-api-chassis-template"
  :license {:name "MIT License" :url "http://opensource.org/licenses/MIT"}
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :scm {:name "git" :url "https://github.com/mping/compojure-api-chassis-template.git"}
  :eval-in-leiningen true)

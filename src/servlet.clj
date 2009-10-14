(ns servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use compojure.http compojure.html))

(defroutes {{ app-id }}-app
  (GET "/"
    (html [:h1 "Hello, World!"])))

(defservice {{ app-id }}-app)

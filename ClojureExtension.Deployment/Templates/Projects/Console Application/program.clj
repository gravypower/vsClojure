;Compilation notes:
; The clojure compiler will generate many dlls [namespace].clj.dll & [classname].dll
; All the dlls & clj files should be automatically copied to the bin folder on run/build.
; The vsClojure installer should have stored the core framework directory in the VSCLOJURE_RUNTIMES_DIR environment variable pointing to C:\Users\[username]\AppData\Local\Microsoft\VisualStudio\11.0\Extensions\[randomCharacters]\Runtimes\

(ns program
  (:gen-class))

(defn -main [& args]
  (println "Hello, World!")
  (println "Press any to quit...")
  (System.Console/ReadKey))
(defproject social-media-sentiment-analyzer "0.1.0-SNAPSHOT"
  :description "A simple social media sentiment analyzer in Clojure"
  :url "http://example.com/social-media-sentiment-analyzer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-http "3.12.2"]
                 [cheshire "5.10.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [incanter "1.9.3"]]
  :main ^:skip-aot social-media-sentiment-analyzer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

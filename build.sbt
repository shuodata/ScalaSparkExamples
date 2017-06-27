name := "ScalaSparkExamples"

version := "1.0"

organization := "com.taunais"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.1" % "provided"
)
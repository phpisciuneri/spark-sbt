name := "spark-sbt"
organization := "com.github"
scalaVersion := "2.11.12"

val sparkVersion = "2.3.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,

  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

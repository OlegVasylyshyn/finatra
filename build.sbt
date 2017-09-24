import NativePackagerKeys._

packageArchetype.java_application

name := "finatra"

version := "0.0.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0"
)

resolvers +=
  "Twitter" at "http://maven.twttr.com"

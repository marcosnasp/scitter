val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
val junit = "junit" % "junit" % "4.10" % "test"
val commonsCodec = "commons-codec" % "commons-codec" % "1.3"
val commonsHttpClient = "commons-httpclient" % "commons-httpclient" % "3.1"
val commonsLogging = "commons-logging" % "commons-logging" % "1.1.1"
val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

val dependenciesTest = Seq(scalaTest, junit)
val dependencies = Seq(commonsCodec, commonsHttpClient, commonsLogging, scalaXml)

val allDependencies = dependenciesTest ++: dependencies

lazy val root = (project in file(".")).
  settings(
    name := "scitter",
    version := "1.0",
    scalaVersion := "2.11.4",
    libraryDependencies ++= allDependencies
  )
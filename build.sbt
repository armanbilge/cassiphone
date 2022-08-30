ThisBuild / tlBaseVersion := "0.0"

ThisBuild / organization := "com.armanbilge"
ThisBuild / organizationName := "Arman Bilge"
ThisBuild / developers += tlGitHubDev("armanbilge", "Arman Bilge")
ThisBuild / startYear := Some(2022)
ThisBuild / tlSonatypeUseLegacyHost := false

ThisBuild / crossScalaVersions := Seq("3.1.3", "2.13.8")

lazy val root = project.in(file(".")).aggregate(core).enablePlugins(NoPublishPlugin)

lazy val core = project
  .in(file("core"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "cassiphone-core",
    libraryDependencies ++= Seq(
      "io.circe" %%% "circe-numbers" % "0.14.2"
    )
  )

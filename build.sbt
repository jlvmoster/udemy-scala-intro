ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "udemy-scala-intro",
    idePackagePrefix := Some("com.mosterinc")
  )

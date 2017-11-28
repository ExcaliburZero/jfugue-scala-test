name := "jfuguetest"

version := "1.0"

scalaVersion := "2.12.1"

mainClass in Compile := Some("jfuguetest.Main")

// Linting
resolvers += Resolver.sonatypeRepo("snapshots")
addCompilerPlugin("org.psywerx.hairyfotr" %% "linter" % "0.1-SNAPSHOT")

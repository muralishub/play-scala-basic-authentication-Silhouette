
name := "authentication"

version := "0.1"

lazy val `play-scala-basic-authentication-silhouette` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  jdbc, ehcache, ws, specs2 % Test, guice,
  // Silhouette dependencies
  "com.mohiva" %% "play-silhouette" % "7.0.0",
  "com.mohiva" %% "play-silhouette-password-bcrypt" % "7.0.0",
  "com.mohiva" %% "play-silhouette-crypto-jca" % "7.0.0",
  "com.mohiva" %% "play-silhouette-persistence" % "7.0.0",
  "com.mohiva" %% "play-silhouette-testkit" % "7.0.0" % "test",
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",

  // use scala syntax on guice vs java
  "net.codingwell" %% "scala-guice" % "4.2.6"
)

resolvers ++= Seq(
  Resolver.jcenterRepo,
  "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

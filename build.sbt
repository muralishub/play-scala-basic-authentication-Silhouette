
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
  "com.mohiva" %% "play-silhouette-totp" % "7.0.0",
  "com.adrianhurt" %% "play-bootstrap" % "1.5.1-P27-B4",
  "org.webjars" %% "webjars-play" % "2.8.0",
  "org.webjars" % "bootstrap" % "4.4.1" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.2.1",
  "net.codingwell" %% "scala-guice" % "4.2.6",
  "com.iheart" %% "ficus" % "1.4.7",
  "com.typesafe.play" %% "play-mailer" % "7.0.1",
  "com.typesafe.play" %% "play-mailer-guice" % "7.0.1",
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.8.2-akka-2.6.x",
  "com.mohiva" %% "play-silhouette-testkit" % "7.0.0" % "test",
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",

  // use scala syntax on guice vs java
  "net.codingwell" %% "scala-guice" % "4.2.6"
)

resolvers ++= Seq(
  Resolver.jcenterRepo,
  "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

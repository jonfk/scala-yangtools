name := """scala-yangtools"""

version := "1.0"

scalaVersion := "2.11.1"

resolvers += Resolver.mavenLocal

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

libraryDependencies += "org.opendaylight.yangtools" % "yang-parser-impl" % "0.7.0-SNAPSHOT"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"


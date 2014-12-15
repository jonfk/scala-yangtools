name := """scala-yangtools"""

version := "1.0"

scalaVersion := "2.11.1"

resolvers += Resolver.mavenLocal

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

libraryDependencies += "org.opendaylight.yangtools" % "yang-parser-impl" % "0.7.0-SNAPSHOT"

libraryDependencies += "org.opendaylight.yangtools" % "maven-sal-api-gen-plugin" % "0.7.0-SNAPSHOT"

libraryDependencies += "com.eed3si9n" %% "treehugger" % "0.3.0"

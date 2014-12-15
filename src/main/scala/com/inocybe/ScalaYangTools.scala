package com.inocybe

import java.io.File

import scala.collection.JavaConverters._
import scala.io.Source
import org.opendaylight.yangtools.yang.parser.impl.YangParserImpl
import org.opendaylight.yangtools.maven.sal.api.gen.plugin.CodeGeneratorImpl
import org.sonatype.plexus.build.incremental.DefaultBuildContext

object ScalaYangTools {
  def main(args: Array[String]): Unit = {
    val parser = new YangParserImpl() //.getInstance()
    val ietfTypeFiles = new File("yangtest/ietf").listFiles()
    //val yangFiles = List(new File("yangtest/test.yang"), new File("yangtest/binary-type-test.yang"), new File("yangtest/binary-types@2013-06-13.yang")) ++ ietfTypeFiles.toList
    val yangFiles = List(new File("yangtest/binary-types@2013-06-13.yang"))
    //val schema = parser.parseFile(yangFile, new File("yangtest")
    val schemaContext = parser.parseFiles( yangFiles.asJava )
    println(schemaContext.toString)

    val codeGen = new CodeGeneratorImpl()
    val bctx = new DefaultBuildContext()
    codeGen.setBuildContext(bctx)
    val files = codeGen.generateSources(schemaContext, new File("yangtest/output"),schemaContext.getModules )

  }

  def readFile(yangfile: String): String = {
    Source.fromFile(yangfile).mkString
  }
}

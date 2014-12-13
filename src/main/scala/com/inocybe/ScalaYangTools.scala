package com.inocybe

import java.io.File

import scala.io.Source
import org.opendaylight.yangtools.yang.parser.impl.YangParserImpl

object ScalaYangTools {
  def main(args: Array[String]): Unit = {
    //println("yang : \n" + readFile("test.yang"))
    val parser = YangParserImpl.getInstance()
    val yangFile = new File("yangtest/test.yang")
    val schema = parser.parseFile(yangFile, new File("yangtest"))
  }

  def readFile(yangfile: String): String = {
    Source.fromFile(yangfile).mkString
  }
}

package cbt_test_macros_build
import cbt._

class Build(val context: Context) extends Macroparadise{
  override def defaultScalaVersion = "2.12.2"

  override def dependencies = 
    super.dependencies :+
    Resolver(mavenCentral).bindOne("org.scalameta" %% "scalameta" % "1.8.0")
}


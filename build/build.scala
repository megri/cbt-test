package cbt_test_build
import cbt._

class Build(val context: Context) extends BaseBuild{
  override def defaultScalaVersion = "2.12.2"
  
  override def dependencies = 
    super.dependencies :+
    DirectoryDependency(projectDirectory ++ "/macros")
}


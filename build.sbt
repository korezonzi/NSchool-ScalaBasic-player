//name := "night-core-player"
//version := "0.1"

lazy val commonSettings = Seq(
  version := "1.0.0-SNAPSHOT",
  organization := "jp.ed.nnn",
  scalaVersion := "2.13.1"
  //scalaVersion := "2.12.7"
)

val osName: SettingKey[String] = SettingKey[String]("osName")

osName := (System.getProperty("os.name") match {
  case name if name.startsWith("Linux") => "linux"
  case name if name.startsWith("Mac") => "mac"
  case name if name.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
})

libraryDependencies += "org.openjfx" % "javafx-base" % "11-ea+25" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-controls" % "11-ea+25" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-fxml" % "11-ea+25" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-graphics" % "11-ea+25" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-web" % "11-ea+25" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-media" % "11-ea+25" classifier osName.value
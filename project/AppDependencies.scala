import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "9.9.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootStrapPlayVersion
  )

  val test: Seq[ModuleID] = Seq(
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.0"             % "test",
    "org.scalatest"       %% "scalatest"              % "3.2.11"             % "test",
    "uk.gov.hmrc"         %% "bootstrap-test-play-30" % bootStrapPlayVersion % "test"
  )
}
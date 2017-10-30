package org.terasology

import org.terasology.entitySystem.systems.{BaseComponentSystem, RegisterSystem}
import org.terasology.logic.console.commandSystem.annotations.Command

@RegisterSystem
class ScalaCommands extends BaseComponentSystem {

  val scalaVersion = scala.util.Properties.versionString

  @Command(shortDescription = "Scala test command", runOnServer = false)
  def helloScala() = s"Hello there, this is Scala $scalaVersion =)"
}

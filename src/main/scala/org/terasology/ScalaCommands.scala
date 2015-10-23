package org.terasology

import org.terasology.entitySystem.systems.{BaseComponentSystem, RegisterSystem}
import org.terasology.logic.console.commandSystem.annotations.Command

@RegisterSystem
class ScalaCommands extends BaseComponentSystem {

  @Command(shortDescription = "Scala test command", runOnServer = false)
  def helloScala() = "Hello there, this is Scala =)"
}

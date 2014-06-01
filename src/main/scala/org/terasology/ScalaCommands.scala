import org.terasology.entitySystem.systems.{RegisterSystem, BaseComponentSystem}
import org.terasology.logic.console.Command

@RegisterSystem
class ScalaCommands extends BaseComponentSystem {

  @Command(shortDescription = "Scala test command", runOnServer = false)
  def helloScala() = "Hello there, this is Scala =)"
}

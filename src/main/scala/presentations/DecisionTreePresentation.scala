package presentations

import decisiontree.{DecisionTree, GarbageType}
import logic.Actor

import scala.util.Random

/**
 * Created by azranel on 16.05.15.
 */
object DecisionTreePresentation {

  def presentation() = {
    val randomizer = new Random()
    val garbageTypes = GarbageType.values()
    for(i <- 0 to 10) {
      Actor.fuel = randomizer.nextInt(Actor.MAX_FUEL)
      Actor.garbageSize = randomizer.nextInt(Actor.MAX_GARBAGE_SIZE)
      Actor.garbageWeight = randomizer.nextInt(Actor.MAX_GARBAGE_WEIGHT)
      Actor.garbageType = garbageTypes(randomizer.nextInt(garbageTypes.size))
      printActorStats()
      println("ACTION: " + DecisionTree.findNextMoveForActor() + "\n")
    }
  }

  private def printActorStats() = {
    val builder = new StringBuilder("")
    builder.append("FUEL: ").append(Actor.fuel).append("\n")
    builder.append("GARBAGE SIZE: ").append(Actor.garbageSize).append("\n")
    builder.append("GARBAGE WEIGHT: ").append(Actor.garbageWeight).append("\n")
    builder.append("GARBAGE TYPE: ").append(Actor.garbageType)
    println(builder.toString())
  }
}

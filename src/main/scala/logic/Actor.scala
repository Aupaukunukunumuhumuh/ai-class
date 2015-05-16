package logic

import java.awt.Graphics2D
import java.io.File
import javax.imageio.ImageIO

import decisiontree.GarbageType

/**
 * Created by kara on 04.05.15.
 */

object Actor{
  val MIN_FUEL = 0
  val MAX_FUEL = 100
  val MIN_GARABGE_SIZE = 0
  val MAX_GARBAGE_SIZE = 30000
  val MIN_GARABGE_WEIGHT = 0
  val MAX_GARBAGE_WEIGHT = 1000

  def getDataForDefiningAction: Array[Double] = {
    return Array[Double](fuel.toDouble, garbageWeight.toDouble, garbageSize.toDouble, garbageType.getValue)
  }

  val ACTOR_FILE = new File("./resources/glasses-help2.png")
  var x = 0;
  var y = 0;
  var fuel = 100;
  var garbageSize = 0;
  var garbageWeight = 0;
  var garbageType : GarbageType = GarbageType.NONE
}



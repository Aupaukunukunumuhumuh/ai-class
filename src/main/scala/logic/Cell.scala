package logic

import java.io.File

import scala.io.Source

/**
 * Created by azranel on 4/28/15.
 */
class Cell(val x : Int, val y :Int, val isObstacle : Boolean = false, var image : File = CellObject.GRASS_FILE)  {
}

object CellObject {
  val CELL_SIZE = 32
  val GRASS_FILE = new File("./resources/green2.jpg")
  val SMALL_GRASS_FILE = new File("./resources/green.jpg")
}
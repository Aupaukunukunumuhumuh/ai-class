package logic

import java.io.File

import scala.io.Source

/**
 * Created by azranel on 4/28/15.
 */
class Cell(val x : Int, val y :Int, val isObstacle : Boolean = false, var image : File = Cell.GRASS_FILE)  {
}

object Cell {
  val GRASS_FILE = new File("./resources/green2.jpg")
  val WALL_FILE = new File("./resources/wall.png")
  val CELL_TYPES = List("0", "1")

  def isCellType(s : String): Boolean = {
    return CELL_TYPES.contains(s)
  }

}
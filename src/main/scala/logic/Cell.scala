package logic

import java.io.File

/**
 * Created by azranel on 4/28/15.
 */
class Cell(val x : Int, val y :Int, val isObstacle : Boolean, val image : File)  {

}

object CellObject {
  val CELL_SIZE = 10
}

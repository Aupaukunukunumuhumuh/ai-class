package logic

import java.io.File

/**
 * Created by Piotr on 2015-05-04.
 */
class WorldObject(val x : Int,
                  val y : Int,
                  val isObstacle : Boolean = false,
                  val isTrash : Boolean = false,
                  val typeOfTrash : String,
                  val imageFile : File) {


}

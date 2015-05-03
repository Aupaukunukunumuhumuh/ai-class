package logic

import gui.MapPanel

/**
 * Created by azranel on 4/28/15.
 */
class Map(val mapPanel : MapPanel) {
  val board = Array.ofDim[Cell](Map.MAP_SIZE, Map.MAP_SIZE)

  for(xs <- 0 to Map.MAP_SIZE-1; ys <- 0 to Map.MAP_SIZE-1) { board(xs)(ys) = new Cell(xs, ys) }
}

object Map {
  val MAP_SIZE = 15
}

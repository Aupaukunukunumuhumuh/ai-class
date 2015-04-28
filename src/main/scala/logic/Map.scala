package logic

import gui.MapPanel

/**
 * Created by azranel on 4/28/15.
 */
class Map(val mapPanel : MapPanel) {
  val board = new Array[Cell](30)(30)

  def drawBoard() = board.foreach(mapPanel.drawTile(_))
}

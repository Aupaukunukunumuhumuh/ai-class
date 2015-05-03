package logic

import gui.MapPanel

/**
 * Created by azranel on 4/28/15.
 */
class Map(val mapPanel : MapPanel) {
  val board = Array.ofDim[Cell](20, 20)

  def drawBoard() = board.foreach(_.foreach(mapPanel.drawTile(_)))
}

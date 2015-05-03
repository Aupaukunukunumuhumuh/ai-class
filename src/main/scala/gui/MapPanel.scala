package gui

import java.awt.{Graphics2D, Color, Dimension}
import java.io.File
import javax.imageio.ImageIO
import logic.{CellObject, Cell}

import scala.swing.{Swing, Panel}

/**
 * Created by azranel on 4/27/15.
 */
class MapPanel extends Panel {
  maximumSize = new Dimension(logic.Map.MAP_SIZE*logic.CellObject.CELL_SIZE,
                              logic.Map.MAP_SIZE*logic.CellObject.CELL_SIZE)
  background = new Color(0, 0, 0)
  border = Swing.EmptyBorder(10, 10, 10, 10)

  override def paintComponent(g: Graphics2D): Unit = {
    //All drawing is done here
    AppWindow.map.board.foreach(_.foreach(drawTile(g, _)))
  }

  private def drawTile(g : Graphics2D, tile : Cell): Unit = {
    val image = ImageIO.read(tile.image)
    g.drawImage(image, tile.x*CellObject.CELL_SIZE,
      tile.y*CellObject.CELL_SIZE, null)
  }
}

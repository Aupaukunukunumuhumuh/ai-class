package gui

import java.awt.{Graphics2D, Color, Dimension}
import java.io.File
import javax.imageio.ImageIO

import logic.{Actor, Cell}

import scala.swing.{Swing, Panel}

/**
 * Created by azranel on 4/27/15.
 */
class MapPanel extends Panel {
  private val CELL_SIZE = 32

  maximumSize = new Dimension(logic.Map.MAP_SIZE*CELL_SIZE,
                              logic.Map.MAP_SIZE*CELL_SIZE)
  background = new Color(0, 0, 0)
  border = Swing.EmptyBorder(10, 10, 10, 10)


  override def paintComponent(g: Graphics2D): Unit = {
    //All drawing is done here
    AppWindow.map.board.foreach(_.foreach(drawTile(g, _)))
    AppWindow.mapPanel.drawActor(g)
  }

  private def drawTile(g : Graphics2D, tile : Cell): Unit = {
    val image = ImageIO.read(tile.image)
    g.drawImage(image, tile.x*CELL_SIZE,
      tile.y*CELL_SIZE, null)
  }

  private def drawActor(g: Graphics2D) : Unit = {
    val image = ImageIO.read(Actor.ACTOR_FILE)
    g.drawImage(image, Actor.x*CELL_SIZE,
      Actor.y*CELL_SIZE, null)
  }
}

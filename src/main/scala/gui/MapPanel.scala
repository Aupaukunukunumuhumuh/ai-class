package gui

import java.awt.{Graphics2D, Color, Dimension}
import java.io.File
import javax.imageio.ImageIO
import logic.Cell

import scala.swing.{Swing, Panel}

/**
 * Created by azranel on 4/27/15.
 */
class MapPanel extends Panel {
  minimumSize = new Dimension(800, 400)
  background = new Color(255, 0, 0)
  border = Swing.EmptyBorder(10, 10, 10, 10)

  val image = new File("./resources/grass.png")

  def drawTile(tile : Cell): Unit = {
    val image = ImageIO.read(tile.image)
    val graphics = image.createGraphics()
    graphics.drawImage(image, tile.x*Cell.CELL_SIZE,
                        tile.y*Cell.CELL_SIZE, null)
  }
}

package gui

import java.awt.{Graphics2D, Color, Dimension}
import java.io.File
import javax.imageio.ImageIO

import scala.swing.{Swing, Panel}

/**
 * Created by azranel on 4/27/15.
 */
class MapPanel extends Panel {
  minimumSize = new Dimension(800, 400)
  background = new Color(255, 0, 0)
  border = Swing.EmptyBorder(10, 10, 10, 10)

  val image = new File("./resources/grass.png")


  override def paintComponent(g: Graphics2D): Unit = {
    g.setColor(new Color(0, 255, 0))
    g.fillRect(0, 0, 800, 400)
    for(x <- 0 to 20; y <- 0 to 14) {
      g.drawImage(ImageIO.read(image), x*32, y*32, null)
    }
  }
}

package gui

import java.awt.Graphics2D
import java.io.File
import javax.imageio.ImageIO

import scala.swing._

/**
 * Created by azranel on 4/26/15.
 */
object AppWindow extends SimpleSwingApplication {
  def show(unit: Unit) = { top.visible = true }


  val logTextArea = new LogTextArea
  val mapPanel = new MapPanel

  def top = new MainFrame {
    title = "AI-Class Project"
    minimumSize = new Dimension(900, 700)

    contents = new GridPanel(2, 1) {
      contents += mapPanel
      contents += logTextArea
      border = Swing.EmptyBorder(10, 10, 10, 10)
    }
  }
}

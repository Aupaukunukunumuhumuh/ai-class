package main

import java.awt.Graphics2D

import gui.AppWindow
import logic.CellObject

/**
 * Created by azranel on 4/20/15.
 */
object Main {
  def main(args: Array[String]) {
    AppWindow.show()
    AppWindow.logTextArea.write("VERBOSE", "LOL")
  }
}

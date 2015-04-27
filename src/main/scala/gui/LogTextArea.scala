package gui

import java.awt.Dimension

import utils.HTMLEditor

import scala.swing.{EditorPane, Color, Swing, TextArea}

/**
 * Created by azranel on 4/27/15.
 */
class LogTextArea extends EditorPane with LogWriteTrait {
  maximumSize = new Dimension(800, 50)
  preferredSize = new Dimension(800, 200)
  border = Swing.EmptyBorder(10, 10, 10, 10)
  editable = false

  def write(tag : String, msg : String, color : Color = new Color(0, 0, 0)) = {
    val tagText = htmlEditor.bold(braceTag(tag))
    val logText = List(tagText, ":", msg, "\n").mkString(" ")
    text += logText
  }
}

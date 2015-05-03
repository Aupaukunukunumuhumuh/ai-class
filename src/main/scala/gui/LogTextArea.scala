package gui

import java.awt.Dimension

import utils.HTMLEditor

import scala.swing.{EditorPane, Color, Swing, TextArea}

/**
 * Created by azranel on 4/27/15.
 */
class LogTextArea extends EditorPane with LogWriteTrait {
  preferredSize = new Dimension(320, 200)
  border = Swing.EmptyBorder(10, 10, 10, 10)
  editable = false

  def write(tag : String, msg : String, color : Color = new Color(0, 0, 0)) = {
    //TODO: make @LogTextArea to view HTML
    //    val tagText = htmlEditor.bold(braceTag(tag))
    val tagText = tag
    val logText = List(tagText, ":", msg, "\n").mkString(" ")
    text += logText
  }
}

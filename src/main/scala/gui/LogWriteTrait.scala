package gui

import utils.HTMLEditor

import scala.swing.Color

/**
 * Created by azranel on 4/27/15.
 */
trait LogWriteTrait {
  val htmlEditor = new HTMLEditor
  def write(tag : String, msg : String, tagColor : Color)
  def braceTag(tag : String) : String = "[" + tag + "]"
}

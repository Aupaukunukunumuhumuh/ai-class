package gui

import org.scalatest.{FlatSpec, Matchers, FunSuite}

import scala.swing.Color

/**
 * Created by azranel on 4/27/15.
 */
class LogWriteTraitTest extends FlatSpec with Matchers {
  val subject = new LogWriteTrait {
    override def write(tag: String, msg: String, tagColor: Color): Unit = {}
  }

  ".braceTag" should "return braced tag" in {
    val tag = "tag"
    subject.braceTag(tag) should be ("[tag]")
  }

  "htmlEditor" should "not be null" in {
    subject.htmlEditor should not be null
  }
}

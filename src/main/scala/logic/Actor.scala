package logic

/**
 * Created by kara on 04.05.15.
 */
class Actor (var x : Int, var y : Int ) {
  
  val actorImage = scala.io.Source.fromFile("glasses-hlep2.png")
  val byteArray = actorImage.map(_.toByte).toArray
  actorImage.close()

}

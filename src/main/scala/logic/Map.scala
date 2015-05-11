package logic

import gui.MapPanel

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
 * Created by azranel on 4/28/15.
 */
class Map(val mapPanel : MapPanel) {
  val board = Array.ofDim[Cell](Map.MAP_SIZE, Map.MAP_SIZE)

  Map.initializeMap(board)
}

object Map {
  val MAP_SIZE = 15
  val MAP_FILE_PATH = "./resources/map.txt"

  def initializeMap(board : Array[Array[Cell]]): Unit = {
    var cellTypesList = new ListBuffer[String]
    Source.fromFile(MAP_FILE_PATH).foreach(c => cellTypesList += c.toString)
    val filteredCellTypesList = cellTypesList.filter(s => Cell.isCellType(s)).map(s => s.toInt).toList
    fillMapWithCellObjects(board, filteredCellTypesList)
  }
  private def fillMapWithCellObjects(board : Array[Array[Cell]], types : List[Int]): Unit = {
    var (x, y) = (0, 0)
    for(cellType <- types) {
      board(x)(y) = cellType match {
        case 0 => new Cell(x, y)
        case 1 => new Cell(x, y, true, Cell.WALL_FILE)
      }
      if(x == MAP_SIZE-1) {
        y += 1
        x = 0
      } else x+=1
    }
  }
}

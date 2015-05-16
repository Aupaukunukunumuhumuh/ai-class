package main

import java.awt.Graphics2D

import decisiontree.{GarbageType, DecisionTree}
import gui.AppWindow
import weka.classifiers.Evaluation
import weka.classifiers.trees.{J48, Id3}
import weka.core.{Instances, Instance}
import weka.core.converters.ConverterUtils.DataSource


/**
 * Created by azranel on 4/20/15.
 */
object Main {
  def main(args: Array[String]) {
    AppWindow.show()
    AppWindow.logTextArea.write("VERBOSE", "LOL")


    println(DecisionTree.findNextMoveForActor())
    println(DecisionTree.findNextMoveForActor().toString)


//    val eval = new Evaluation(data)
//    eval.evaluateModel(tree, data)
//    val classified =
//    println(classified)
    //println(eval.toSummaryString("RESULT: ", false))
  }
}

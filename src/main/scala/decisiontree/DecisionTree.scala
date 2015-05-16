package decisiontree

import logic.Actor
import weka.classifiers.trees.J48
import weka.core.Instance
import weka.core.converters.ConverterUtils.DataSource

/**
 * Created by azranel on 15.05.15.
 */
class DecisionTree {
}

object DecisionTree {
  val DATA_FILE = "./resources/danedrzewo.csv"

  private val source = new DataSource(DATA_FILE)
  private val data = source.getDataSet
  data.setClassIndex(data.numAttributes() - 1)
  private val options = new Array[String](1)
  options(0) = "-U"
  private val tree = new J48()
  tree.setOptions(options)
  tree.buildClassifier(data)


  def findNextMoveForActor() : Action = {
    val instance = new Instance(1.0, Actor.getDataForDefiningAction)
    instance.setDataset(data)
    return Action.actionForValue(tree.classifyInstance(instance))
  }
}

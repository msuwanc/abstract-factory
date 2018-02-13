package helpers

object Calculation {
  def getIphonePrice(model: String, storage: Int): Long = {
    (model.toLowerCase, storage) match {
      case ("x", 64) => 40000
      case ("x", 256) => 45000
      case ("8", 64) =>30000
      case ("8", 256) => 35000
      case _ => 0
    }
  }

  def getSamsungPrice(model: String, storage: Int): Long = {
    (model.toLowerCase, storage) match {
      case ("s8", 64) => 20000
      case ("s8", 256) => 25000
      case _ => 0
    }
  }
}
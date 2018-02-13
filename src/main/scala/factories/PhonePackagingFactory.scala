package factories

import models.Connectors.Connector
import models.phones.Phone

trait PhonePackagingFactory {
  def createPhone(model: String, storage: Int, color: String): Phone
  def createConnector: Connector
}
package factories

import java.util.UUID

import helpers.Calculation
import models.Connectors.{Connector, Lightning}
import models.phones.{Iphone, Phone}

class IphonePackagingFactory extends PhonePackagingFactory {
  override def createPhone(model: String, storage: Int, color: String): Phone = Iphone(UUID.randomUUID().toString, model, storage, Calculation.getIphonePrice(model, storage), color)

  override def createConnector: Connector = Lightning(UUID.randomUUID().toString, length = 3.5)
}

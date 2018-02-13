package factories

import java.util.UUID

import helpers.Calculation
import models.Connectors.{Connector, UsbTypeC}
import models.phones.{AndroidPhone, Phone}

class SamsungPackagingFactory extends PhonePackagingFactory {
  override def createPhone(model: String, storage: Int, color: String): Phone = AndroidPhone(UUID.randomUUID().toString, model, storage, Calculation.getSamsungPrice(model, storage), color)

  override def createConnector: Connector = UsbTypeC(UUID.randomUUID().toString, length = 3.5)
}
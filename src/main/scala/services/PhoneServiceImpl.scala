package services

import factories.PhonePackagingFactory
import models.Connectors.Connector
import models.phones.Phone

class PhoneServiceImpl(phonePackagingFactory: PhonePackagingFactory) extends PhoneService {
  override def getPhonePackage(model: String, storage: Int, color: String): (Phone, Connector) = (phonePackagingFactory.createPhone(model, storage, color), phonePackagingFactory.createConnector)
}
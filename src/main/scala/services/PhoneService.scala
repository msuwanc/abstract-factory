package services

import models.Connectors.Connector
import models.phones.Phone

trait PhoneService {
  def getPhonePackage(model: String, storage: Int, color: String): (Phone, Connector)
}
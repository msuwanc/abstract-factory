import factories.{IphonePackagingFactory, SamsungPackagingFactory}
import models.Connectors.Connector
import models.phones.Phone
import services.PhoneServiceImpl

import scala.io.StdIn

object Main extends App {
  val wantedPhone = StdIn.readLine("What phone do you want? /n We have iPhone(x and 8) and Samsung(s8)")
  val wantedStorage = StdIn.readLine("What storage do you want? /n We have 64 and 256").toInt
  val wantedColor = StdIn.readLine("What color do you want?")

  val iphonePackagingFactory = new IphonePackagingFactory
  val samsungPackagingFactory = new SamsungPackagingFactory

  val iphoneService = new PhoneServiceImpl(iphonePackagingFactory)
  val samsungService = new PhoneServiceImpl(samsungPackagingFactory)

  (wantedPhone.toLowerCase.replaceAll(" ", ""), wantedStorage) match {
    case ("iphonex", 64) => {
      val iphonePackaging: (Phone, Connector) = iphoneService.getPhonePackage("x", wantedStorage, wantedColor)

      println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
    }
    case ("iphonex", 256) => {
      val iphonePackaging: (Phone, Connector) = iphoneService.getPhonePackage("x", wantedStorage, wantedColor)

      println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
    }
    case ("iphone8", 64) => {
      val iphonePackaging: (Phone, Connector) = iphoneService.getPhonePackage("8", wantedStorage, wantedColor)

      println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
    }
    case ("iphone8", 256) => {
      val iphonePackaging: (Phone, Connector) = iphoneService.getPhonePackage("8", wantedStorage, wantedColor)

      println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
    }
    case ("samsungs8", 64) => {
      val iphonePackaging: (Phone, Connector) = samsungService.getPhonePackage("s8", wantedStorage, wantedColor)

      println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
    }
    case ("samsungs8", 256) => {
      {
        val iphonePackaging: (Phone, Connector) = samsungService.getPhonePackage("s8", wantedStorage, wantedColor)

        println(s"You've got ${iphonePackaging._1} and ${iphonePackaging._2}")
      }
    }
    case _ => println("Invalid input")
  }
}
package models.Connectors

abstract class Connector {
  def id: String
  def price: Long
  def length: Double
}
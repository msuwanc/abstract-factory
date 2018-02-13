package models.phones

abstract class Phone {
  def id: String
  def model: String
  def storage: Int
  def price: Long
  def color: String
}
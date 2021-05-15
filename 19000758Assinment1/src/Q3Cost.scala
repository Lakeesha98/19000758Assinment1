object Q3Cost extends App {
  val coverPrice=24.95
  val noOfBooks=60
  val discount=0.4

  def shippingCost(noOfBooks:Int):Double={
    if(noOfBooks<=50) 3.0
    else 3.0+(0.75*(noOfBooks-50))
  }
  def calDiscount(coverPrice:Double,noOfBooks:Int,discount:Double):Double={
    coverPrice*noOfBooks*discount
  }
  def wholesaleCost(coverPrice:Double,noOfBooks:Int,discount:Double):Double={
    coverPrice*noOfBooks+shippingCost(noOfBooks)-calDiscount(coverPrice,noOfBooks,discount)
  }
  println("Total Wholesale Cost = "+wholesaleCost(coverPrice, noOfBooks, discount))

}

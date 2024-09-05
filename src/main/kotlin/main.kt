fun main(

) {
    val amount=1250
    val Commission=0.0075
    val minCommission=35
    var tax=if(amount*Commission<minCommission) minCommission else amount*Commission
    println(tax)
    tax=150

}
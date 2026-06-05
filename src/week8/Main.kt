package week8

fun main(){
     println("=== TESET SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak ada"
    println("destination = ${destination}")
}
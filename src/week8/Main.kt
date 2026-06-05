package week8

fun main(){
     println("=== TESET SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak ada"
    println("destination = ${destination}")

    println("=== TEST LET BLOCKS ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price -> val tax = price *0.11
        "Transaksi valid. Harga : Rp$price, tax: $tax"
    } ?: "Transaksi Invalid"

    println("=== TEST SAFE CASTING ===")
    val mixedData : List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null)
        "Laptop",
        450000.0
    )

}
package week8

fun main(){
     println("=== TESET SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak ada"
    println("destination = ${destination}")

    println("\n=== TEST LET BLOCKS ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price -> val tax = price *0.11
        "Transaksi valid. Harga : Rp$price, tax: $tax"
    } ?: "Transaksi Invalid"

    println("\n=== TEST SAFE CASTING ===")
    val mixedData : List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        450000.0
    )

    for(i in mixedData){
        val text = i as? String
        text?.let {
            println(it.uppercase())
        }
    }

    val someObject : Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + Fallback ${safeString}")

    println("\n=== TEST RED BUTTON (!!) ===")
    val toxicData : String? = null
    try{
        val length = toxicData!!.length
    }
    catch(e: NullPointerException){
        println("NullPointerException")
    }

    val apiResponse : Map<String, String?> = mapOf("status" to "200", "token" to null)
    try{
        val token = requireNotNull(apiResponse["token"]){
            "CRITICAL EXCEPTION: Token null"
        }
    }
    catch(e: IllegalArgumentException){
        println(e.message)
    }
}
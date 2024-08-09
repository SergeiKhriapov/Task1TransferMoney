fun main() {
    val commissionRate = 0.75
    val minСommission = 35
    val amount = 48
    val commission = if (amount * commissionRate <= minСommission) minСommission else amount * commissionRate
    println(
        """
        Сумма перевода $amount руб., комиссия составила ${commission.toInt()} руб.
    """.trimIndent()
    )
}
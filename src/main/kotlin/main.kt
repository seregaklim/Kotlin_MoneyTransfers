fun main () {
       val amout: Long = 100
       val minimumMoneyTransferRubles  = 35
       val convectorRublesToKopecks: Long = amout * 100
       val commission: Double = 0.75/100
       var result = if (amout < minimumMoneyTransferRubles) {} else  convectorRublesToKopecks * commission
       println ("Перевод $result копеек")
}
fun main () {
       val amoutUser: Long = 36
       val userKopecks: Long = amoutUser * 100

       val transferRubles  = 35
       val transferKopecks = transferRubles * 100

       val commission: Double = 0.75/100

       var result = if ( userKopecks <= transferKopecks) userKopecks - transferKopecks else
       if (userKopecks >= transferKopecks) transferKopecks* commission
              else "Недостаточно средств!"

       println ("Перевод $result копеек")
}
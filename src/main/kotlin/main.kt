fun main () {
       val amout = 100
       val minimumMoneyTransferRubles  = 35
       val convectorRublesToKopecks = amout * 100
       val commission = 0.75/100
       var result = if (amout < minimumMoneyTransferRubles) {
       }else { convectorRublesToKopecks * commission
       }
       println ("Перевод:" +result + "копеек")
}
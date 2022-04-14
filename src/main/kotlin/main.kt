fun main(){
    var accounts = CurrentAccount("Q32e12","072367723","Mohamed Ahmed", 2000)
    accounts.deposit(45000.00)

}

open class CurrentAccount(var account:String, var number:String, var accountName:String, var balance:Int ){
    fun deposit(amount:Double){
        var totalDeposit =  + $balance
        println(totalDeposit)

    }
    fun withdraw(amount: Double){

    }
    fun details(){
        var personDetails = "Account number $number with balance $balance is operated by $accountName"
        println(personDetails)
    }

}

class SavingsAccount(account: String,number: String,accountName: String,balance: Int):CurrentAccount(account,number,accountName,balance){

    fun deposit(amount:Double){
        var amountDeposited =
        var totalDeposited = 0

    }
    fun withdrawals(amount: Int){

    }
    fun details(){
        var personDetails = "Account number $number with balance $balance is operated by $accountName"
        println(personDetails)
    }

}

data class product(var name: String, var weight:Int, var price:Int, var category:String){
    when(product) {
        groceries-> "Cabbage"
        hygiene-> "clean"
        other -> "none"

    }
}

fun evenIndices(word:String):String{
    var character = "Pinapple"
    var words = word[2],word[4],
    println(words.indice(word[2],word[4],word[6]))

}
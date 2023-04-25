fun main() {
randomStrings("Kotlin")
    println(randomStrings("Kotlin"))

    println(randomStrings("Kotlin").length)
    multiples()

     passwords("euni")

    var account1 = CurrentAccount(2037359,"Amanda Wimmers",5000.00)
    println(account1.deposit(4000.00))
    println(account1.withdraw(2000.00))
    account1.details()
    var account2 = SavingsAccount(4130598, "Lucas Mark", 9000.00)
    println(account2.deposit(2000.00))
    println(account2.details())
    println(account2.withdraw(5))
}
//args: Array<String>//
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomStrings(name: String):String{
    return name
      println(name[0])




}
//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun passwords (password:String): Boolean{
    if (password.length>=8 && password.length<=16 && password!="password"){
        println(true)
    }
    else{
        println(false)
    }


}

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    for (num in 1..100)
        if (num%6 == 0 && num % 8 == 0) {
            println("Bingo!")

        }
    else {
            println(num)
        }
}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class  CurrentAccount (var accountNumber: Int,var accountName: String, var balance: Double){

    fun deposit(amount:Double): Double{
        var newBalance = balance +amount
        return newBalance
    }

    open fun withdraw (amount: Double): Double{
        var newBalance = balance -amount
        return newBalance
    }

    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }

}
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount (accountNumber: Int,accountName: String, balance: Double): CurrentAccount(accountNumber, accountName,balance){

    override fun withdraw(withdrawals: Int) {
        if ( withdrawals<4){
            println("Withdrawal allowed")
        }
        else{
            println("Withdrawal denied")
        }

    }


}
fun main() {
    printName("Caroline")
    var result= GetReminder(9,4)
    println(result)
    var sum=GetSum(4,6,2,5)
    println(sum)
    funFact("researching")


}




fun printName(name:String){
    println("Hello" + " " + name)
}

fun GetReminder(num1:Int,num2:Int):Int{
    var modulus=num1 % num2
    return modulus
}

fun GetSum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return sum
}
fun funFact(fact:String){
    println("i enjoy" +" " + fact)
}
package com.example.myapp2

//(String, Int)->Unit
//将上述函数类型添加到某个函数的参数声明或者返回值声明上，那么这个函数就是一个高阶函数了

fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int)->Int):Int{
    return operation(num1,num2)
}


fun plus(num1:Int,num2:Int):Int{
    return num1+num2
}
fun minus(num1:Int,num2:Int):Int{
    return num1-num2
}
fun main(){
//    val num1=100
//    val num2=80
    println("请输入num1 按Enter确认")
    val num1= Integer.valueOf(readLine())
    println("请输入num2 按Enter确认")
    val num2= Integer.valueOf(readLine())

    val resultPlus= num1AndNum2(num1,num2,::plus)
    println("plus result is $resultPlus")
    val resultMinus= num1AndNum2(num1,num2,::minus)
    println("minus result is $resultMinus")
}

//fun main(){
//    println("请输入num1 按Enter确认")
//    val num1= Integer.valueOf(readLine())
//    println("请输入num2 按Enter确认")
//    val num2= Integer.valueOf(readLine())
//
//    val resultPlus= num1AndNum2(num1,num2){n1,n2->n1+n2}
//    println("plus result is $resultPlus")
//    val resultMinus= num1AndNum2(num1,num2){n1,n2->n1-n2}
//    println("minus result is $resultMinus")
//}
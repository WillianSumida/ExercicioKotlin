package com.example.exerciciokotlin

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun foo(value1:Int, value2:Int, function:(Int, Int) -> Int): Int{
    return function(value1, value2)
}

fun bar(string1:String, string2:String, function:(String, String)->String):String {
    return function(string1, string2)
}



fun main() {
    /*EXERCICIO 3*/
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))

    /*EXERCICIO 4*/

}





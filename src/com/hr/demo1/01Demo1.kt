package com.hr.demo1

class Rect(var rect: Int, var height: Int) {
}

fun main() {
    var rect01 = Rect(20, 10)
    println("矩形的宽度: ${rect01.rect}")
    println("矩形的高度: ${rect01.height}")
}
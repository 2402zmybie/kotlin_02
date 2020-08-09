package com.hr.demo1

class Girl(var chactor:String, var voice:String) {
    fun smile() {
        println("妹子笑了一下")
    }

    fun cry() {
        println("妹子哭了")
    }
}

fun main() {
    var girl = Girl("彪悍","甜美")
    println("妹子性格${girl.chactor}")
    girl.smile()
    girl.cry()
}
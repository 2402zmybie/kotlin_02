package com.hr.`interface`

class Man:IMan, Human() {
    override fun xiaodidi() {
        println("13cm是我的长度")
    }

    override fun eat() {
        println("抽象类的本质 吃饭..")
    }
}
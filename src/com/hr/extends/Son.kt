package com.hr.extends

//儿子继承父亲并拥有父亲的属性和重写父亲的方法
class Son: Fathor() {

    //重写父亲的方法
    override fun action() {
        println("儿子受过教育,在公共场合很有礼貌")
    }
}
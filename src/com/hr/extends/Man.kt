package com.hr.extends

class Man(name: String) : Human(name) {
    override fun eat() {
        println("${name} 男人哇哇的吃")
    }

    override fun pee() {
        println("男人站着尿尿")
    }

}
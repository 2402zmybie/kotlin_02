package com.hr.extends

class Woman(name: String) : Human(name) {
    override fun eat() {
        println("${name} 女人小口的吃")
    }

    override fun pee() {
        println("女人蹲着尿尿")
    }
}
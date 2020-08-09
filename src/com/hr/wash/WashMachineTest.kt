package com.hr.wash

fun main() {

    var washMachine = WashMachine("小天鹅", 12)
    washMachine.openDoor()
    println("小何把内裤放进去了")
    washMachine.closeDoor()
    washMachine.selectMode(1)
    washMachine.start()
}
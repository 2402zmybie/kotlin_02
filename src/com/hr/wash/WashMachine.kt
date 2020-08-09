package com.hr.wash

//private 就是Kotlin的封装
class WashMachine(var module:String, var size:Int) {

    var isDoorOpen = true
    var currentMode = 0

    fun openDoor() {
        println("洗衣机的门已经打开了")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("洗衣机的门已经关闭了")
        isDoorOpen = false
    }

    fun start() {
        if(isDoorOpen) {
            println("门还没关")
        }else {
            when(currentMode) {
                0 -> println("选择模式错误, 不能开始洗衣服")
                1 -> {
                    println("放水...")
                    println("轻柔模式, 发动机转速慢...")
                    setMotorSpeed(100)
                    println("洗好了 ...")
                }
                2 -> {
                    println("放水...")
                    println("狂柔模式, 发动机转速快...")
                    setMotorSpeed(1000)
                    println("洗好了 ...")
                }
                else -> {
                    println("选择模式错误, 不能开始洗衣服")
                }
            }
        }
    }

    fun selectMode(mode:Int) {
        currentMode = mode
        when(mode) {
            0 -> println("初始模式, 请选择模式")
            1 -> println("轻柔")
            2 -> println("狂揉")
            3 -> println("没有这个模式, 不要乱拧")
        }
    }

    private fun setMotorSpeed(speed: Int) {
        println("当前发动机转速为 ${speed}圈/秒")
    }
}
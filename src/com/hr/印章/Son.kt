package com.hr.印章

/**
 * 小公驴, 小母驴, 小公马生下来的儿子
 *
 * sealed修饰class, 用于定义 子类类型有限的class
 * sealed和枚举的区别:
 *  sealed更在意的是子类的类型
 *  枚举更在意的是数据
 */
sealed class Son {
    class 小小驴():Son()
    class 小骡子():Son()

    fun sayHello() {
        println("大家好")
    }
}
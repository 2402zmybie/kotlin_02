package com.hr.`interface`

fun main() {
    var man = Man()
//    man.xiaodidi()

    var man2 = TaiJian()
//    man2.eat()

    var house = listOf(man,man2)
    for (m in house) {
        //如果是男人的子类
        if(m is Man) {
            m.eat()
        }
    }
}
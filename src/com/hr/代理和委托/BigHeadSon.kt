package com.hr.代理和委托

//class BigHeadSon:IWashBow {
//    override fun washing() {
//        println("我是大头儿子, 洗碗一次赚1块钱")
//    }
//}

//kt中object声明类区别于class,  表示在内存中有且只有一个,且已经被创建了
object BigHeadSon:IWashBow {
    override fun washing() {
        println("我是大头儿子, 洗碗一次赚1块钱")
    }
}
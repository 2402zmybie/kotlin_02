package com.hr.代理和委托

class SmallHeadFather:IWashBow by BigHeadSon {
    override fun washing() {
        println("我是小头爸爸, 洗碗一次赚10块钱")
        BigHeadSon.washing()
        println("我是看着儿子把碗洗好了")

        var son1 = BigHeadSon
        var son2 = BigHeadSon
        println(son1 == son2)
    }
}
package lxh.com.easy.tkotlin

import java.util.*

fun main(args: Array<String>) {
    println("---------")

//    var city = CityDomain(5)
    var city : CityDomain ? =null

    val cityId = city?.let { it.cityId }?:9999

    println("开心科技".substring(0,2))
    println("开".substring(0,2))
}

class CityDomain(val cityId:Int)
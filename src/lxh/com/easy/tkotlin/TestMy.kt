package lxh.com.easy.tkotlin

object TestMy {

    @JvmStatic
    fun main(args: Array<String>) {
        val aa = 1
        val bb = 2
        val a = mutableListOf<Int>(0, 1, 2,3,4)

        println("--a:${ a.filter { it % 2 == 0 }}")
    }
}

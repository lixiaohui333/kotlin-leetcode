package lxh.com.easy.bkotlin

object CanWinNim292 {

    @JvmStatic
    fun main(args: Array<String>) {

        canWinNim(4)
    }

    fun canWinNim(n: Int): Boolean {


        return n % 4 != 0
    }
}

package lxh.com.easy.bkotlin

/*
请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

现有一个链表 -- head = [4,5,1,9]，它可以表示为:
    4 -> 5 -> 1 -> 9
 */
object DeleteNode237 {

    fun deleteNode(node: ListNode) {

        val next = node.nextg
        node.sval = next.sval
        node.nextg = next.nextg
    }


    class ListNode(var sval: Int, var nextg: ListNode)
}
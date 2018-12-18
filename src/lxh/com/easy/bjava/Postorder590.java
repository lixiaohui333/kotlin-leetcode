package lxh.com.easy.bjava;

import lxh.com.easy.comm.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Postorder590 {

    /*
    给定一个 N 叉树，返回其节点值的后序遍历。

                        1
           3            2           4
        5     6

    返回其后序遍历: [5,6,3,2,4,1].
     */
    public List<Integer> postorder(Node root) {

        List<Integer> resultNote = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

//        Stack<Node> result = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {

            Node pop = stack.pop();
//            result.push(pop);
            if (pop == null)
                continue;
            resultNote.add(0, pop.val);
            if (pop == null)
                continue;
            if (pop.children != null) {
                for (Node temp : pop.children) {
                    stack.push(temp);
                }
            }

        }
        return resultNote;
    }

}

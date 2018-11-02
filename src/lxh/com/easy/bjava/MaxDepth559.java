package lxh.com.easy.bjava;

import lxh.com.easy.comm.Node;

import java.util.Stack;

public class MaxDepth559 {

    public static void main(String[] args) {

    }

    public static int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        if (root.children == null) {
            return 1;
        }

        int depth = 0;

        for (Node node : root.children) {
            depth = 1 + Math.max(depth, maxDepth(node));
        }

        return depth;
    }
}

package fizzbuzz;


import tree.Node;

import java.util.ArrayList;

public class IntegerTree {

    public IntegerNode root;

    public void add(int value) {
        this.root = add(this.root, value);
    }

    private IntegerNode add(IntegerNode node, int value) {

        if (node == null) {
            node = new IntegerNode(value);
            return node;
        }

        if (node.value > value) {
            node.left = add(node.left, value);
        } else if (node.value < value) {
            node.right = add(node.right, value);
        }

        return node;
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> intList = new ArrayList<>();
        return inOrder(root, intList);
    }

    private ArrayList<Integer> inOrder(IntegerNode node, ArrayList<Integer> list) {

        if (node != null) {
            inOrder(node.left, list);
            list.add(node.value);
            inOrder(node.right, list);
        }

        return list;
    }
}

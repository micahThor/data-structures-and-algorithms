package tree;

import utility.Queue;

import java.util.ArrayList;

public class BinarySearchTree extends Tree {

    public ArrayList<Integer> breadthFirstTraversal() {

        ArrayList<Integer> resultArray = new ArrayList<>();
        Queue<Node> auxiliaryQueue = new Queue<>();

        if (this.root == null) {
            return resultArray;
        }

        auxiliaryQueue.enqueue(this.root);

        Node tempNode;
        while (!auxiliaryQueue.isEmpty()) {
            tempNode = auxiliaryQueue.dequeue();

            resultArray.add(tempNode.value);

            if (tempNode.left != null) {
                auxiliaryQueue.enqueue(tempNode.left);
            }

            if (tempNode.right != null) {
                auxiliaryQueue.enqueue(tempNode.right);
            }
        }
        return resultArray;
    }

    public void add(int value) {
        this.root = add(this.root, value);
    }

    private Node add(Node node, int value) {

        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (node.value > value) {
            node.left = add(node.left, value);
        } else if (node.value < value) {
            node.right = add(node.right, value);
        }

        return node;
    }

    public boolean contains(int value) {
        return contains(this.root, value);
    }

    private boolean contains(Node node, int value) {

        if (node != null) {
            if (node.value == value) {
                return true;
            } else if (node.value > value) {
                return contains(node.left, value);
            } else if (node.value < value) {
                return contains(node.right, value);
            }
        }
        return false;
    }


}

package tree;


import java.util.ArrayList;

public class Tree {

    public Node root;

    public Tree() {
        this.root = null;
    }

    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> intList = new ArrayList<>();
        return preOrder(root, intList);
    }

    private ArrayList<Integer> preOrder(Node node, ArrayList<Integer> list) {

        if (node != null) {
            list.add(node.value);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
        return list;
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> intList = new ArrayList<>();
        return inOrder(root, intList);
    }

    private ArrayList<Integer> inOrder(Node node, ArrayList<Integer> list) {

        if (node != null) {
            inOrder(node.left, list);
            list.add(node.value);
            inOrder(node.right, list);
        }

        return list;
    }

    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> intList = new ArrayList<>();
        return postOrder(root, intList);
    }

    private ArrayList<Integer> postOrder(Node node, ArrayList<Integer> list) {

        if (node != null) {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.value);
        }
        return list;
    }
}

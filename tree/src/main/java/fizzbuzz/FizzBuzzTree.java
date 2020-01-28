package fizzbuzz;

import java.util.ArrayList;

public class FizzBuzzTree {

    StringNode root;

    public FizzBuzzTree integerToStringTreeify(IntegerTree intTree) {
        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        integerToStringTreeify(intTree.root, fizzBuzzTree);
        return fizzBuzzTree;
    }

    private FizzBuzzTree integerToStringTreeify(IntegerNode intNode, FizzBuzzTree fizzBuzzTree) {

        if (intNode != null) {
            integerToStringTreeify(intNode.left, fizzBuzzTree);

            fizzBuzzTree.add(Integer.toString(intNode.value));

            integerToStringTreeify(intNode.right, fizzBuzzTree);
        }

        return fizzBuzzTree;

    }

    public void fizzBuzzifyStringTree() {
        fizzBuzzifyStringTree(this.root);
    }

    private void fizzBuzzifyStringTree(StringNode node) {

        if (node != null) {
            fizzBuzzifyStringTree(node.left);

            if (Integer.parseInt(node.value) % 5 == 0 && Integer.parseInt(node.value) % 3 == 0) {
                node.value = "FIZZBUZZ";
            } else if (Integer.parseInt(node.value) % 5 == 0) {
                node.value = "FIZZ";
            } else if (Integer.parseInt(node.value) % 3 == 0) {
                node.value = "BUZZ";
            }

            fizzBuzzifyStringTree(node.right);
        }
    }

    public void add(String value) {
        this.root = add(this.root, value);
    }

    private StringNode add(StringNode node, String value) {

        if (node == null) {
            node = new StringNode(value);
            return node;
        }

        if (node.value.compareTo(value) > 0) {
            node.left = add(node.left, value);
        } else if (node.value.compareTo(value) < 0) {
            node.right = add(node.right, value);
        }

        return node;
    }

    public ArrayList<String> inOrder() {
        ArrayList<String> strList = new ArrayList<>();
        return inOrder(root, strList);
    }

    private ArrayList<String> inOrder(StringNode node, ArrayList<String> list) {

        if (node != null) {
            inOrder(node.left, list);
            list.add(node.value);
            inOrder(node.right, list);
        }
        return list;
    }
}


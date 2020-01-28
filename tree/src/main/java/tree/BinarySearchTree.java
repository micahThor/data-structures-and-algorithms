package tree;

public class BinarySearchTree extends Tree {



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

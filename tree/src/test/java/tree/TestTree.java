package tree;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestTree {

    Tree myTestTree;

    @Before
    public void initializeTree() {

        /*
        input:
                       40
                     /    \
                    20    50
                   / \    / \
                  10 30  43 67
                 /
                5
         */

        myTestTree = new Tree();
        myTestTree.root = new Node(40);
        myTestTree.root.right = new Node(50);
        myTestTree.root.right.left = new Node(43);
        myTestTree.root.right.right = new Node(67);
        myTestTree.root.left = new Node(20);
        myTestTree.root.left.right = new Node(30);
        myTestTree.root.left.left = new Node(10);
        myTestTree.root.left.left.left = new Node(5);
    }

    @Test
    public void tree_preOrder() {

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(20);
        expected.add(10);
        expected.add(5);
        expected.add(30);
        expected.add(50);
        expected.add(43);
        expected.add(67);

        ArrayList<Integer> actual = myTestTree.preOrder();

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void tree_inOrder() {

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(10);
        expected.add(20);
        expected.add(30);
        expected.add(40);
        expected.add(43);
        expected.add(50);
        expected.add(67);

        ArrayList<Integer> actual = myTestTree.inOrder();

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void tree_postOrder() {

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(10);
        expected.add(30);
        expected.add(20);
        expected.add(43);
        expected.add(67);
        expected.add(50);
        expected.add(40);

        ArrayList<Integer> actual = myTestTree.postOrder();

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void tree_GetMaxValue() {

        int expected = 67;
        int actual = myTestTree.getMaxValue_breadthFirstTraversal();

        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void tree_GetMaxValue_ThrowsNullPointerException() {

        int expected = 67;

        Tree emptyTree = new Tree();

        int actual = emptyTree.getMaxValue_breadthFirstTraversal();

        assertEquals(expected, actual);
    }
}

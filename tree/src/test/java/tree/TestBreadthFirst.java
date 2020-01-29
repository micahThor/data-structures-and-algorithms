package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestBreadthFirst {

    BinarySearchTree myTestTree;

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

        myTestTree = new BinarySearchTree();

        myTestTree.add(40);
        myTestTree.add(20);
        myTestTree.add(10);
        myTestTree.add(5);
        myTestTree.add(30);
        myTestTree.add(50);
        myTestTree.add(43);
        myTestTree.add(67);
    }

    @Test
    public void test_BreadthFirstSearch() {

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(20);
        expected.add(50);
        expected.add(10);
        expected.add(30);
        expected.add(43);
        expected.add(67);
        expected.add(5);

        ArrayList<Integer> actual = myTestTree.breadthFirstTraversal();

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}

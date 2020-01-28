package tree;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestBinaryTree {

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
    public void tree_contains5() {
        assertTrue(myTestTree.contains(5));
    }

    @Test
    public void tree_contains43() {
        assertTrue(myTestTree.contains(43));
    }

    @Test
    public void tree_contains30() {
        assertTrue(myTestTree.contains(30));
    }

    @Test
    public void tree_contains20() {
        assertTrue(myTestTree.contains(20));
    }

    @Test
    public void tree_contains10() {
        assertTrue(myTestTree.contains(10));
    }
}

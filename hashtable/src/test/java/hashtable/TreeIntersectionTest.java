package hashtable;
import hashtable.utility.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    BinarySearchTree myTestTree1;
    BinarySearchTree myTestTree2;

    @Before
    public void init() {
        myTestTree1 = new BinarySearchTree();
        myTestTree1.add(40);
        myTestTree1.add(20);
        myTestTree1.add(10);
        myTestTree1.add(5);
        myTestTree1.add(30);
        myTestTree1.add(50);
        myTestTree1.add(43);
        myTestTree1.add(67);

        myTestTree2 = new BinarySearchTree();
        myTestTree2.add(40);
        myTestTree2.add(20);
        myTestTree2.add(103);
        myTestTree2.add(5);
        myTestTree2.add(302);
        myTestTree2.add(50);
        myTestTree2.add(43);
        myTestTree2.add(674);
    }

    @Test
    public void TreeIntersection_testHappyPath() {
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(20);
        expected.add(5);
        expected.add(50);
        expected.add(43);

        for (int i = 0; i < actual.size() || i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void TreeIntersection_testTreesOfUnequalSize() {
        myTestTree1.add(34);
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(40);
        expected.add(20);
        expected.add(5);
        expected.add(50);
        expected.add(43);

        for (int i = 0; i < actual.size() || i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void TreeIntersection_testNullInFirstTree() {
        myTestTree1 = null;
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void TreeIntersection_testNullInSecondTree() {
        myTestTree2 = null;
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void TreeIntersection_testNullInBothTrees() {
        myTestTree1 = null;
        myTestTree2 = null;
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void TreeIntersection_testEmptyTreeOne() {
        BinarySearchTree empty = new BinarySearchTree();
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(empty, myTestTree2);
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void TreeIntersection_testEmptyTreeTwo() {
        BinarySearchTree empty = new BinarySearchTree();
        ArrayList<Integer> actual = TreeIntersection.treeIntersection(myTestTree1, empty);
        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }
}

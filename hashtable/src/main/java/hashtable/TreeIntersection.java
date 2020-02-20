package hashtable;


import hashtable.utility.BinarySearchTree;
import hashtable.utility.Node;
import java.util.ArrayList;


public class TreeIntersection {

    public static ArrayList<Integer> treeIntersection(BinarySearchTree tree1, BinarySearchTree tree2) {
        HashTable<Integer, Integer> hTable = createHashTable(tree1);
        ArrayList<Integer> resultArray = createArray(tree2, hTable);
        return resultArray;
    }

    private static HashTable<Integer, Integer> createHashTable(BinarySearchTree tree) {
        HashTable<Integer, Integer> hTable = new HashTable<>();
        if (tree == null) {
            return hTable;
        }
        return createHashTable(tree.root, hTable);
    }

    private static  HashTable<Integer, Integer> createHashTable(Node node, HashTable<Integer, Integer> hTable) {
        if (node != null) {
            hTable.add(node.value, node.value);
            createHashTable(node.left, hTable);
            createHashTable(node.right, hTable);
        }
        return hTable;
    }

    private static  ArrayList<Integer> createArray(BinarySearchTree tree, HashTable<Integer, Integer> hTable) {
        ArrayList<Integer> intList = new ArrayList<>();
        if (tree == null) {
            return intList;
        }
        return createArray(tree.root, intList, hTable);
    }

    private static  ArrayList<Integer> createArray(Node node, ArrayList<Integer> intList, HashTable<Integer, Integer> hTable) {
        if (node != null) {
            if (hTable.contains(node.value)) {
                intList.add(node.value);
            }
            createArray(node.left, intList, hTable);
            createArray(node.right, intList, hTable);
        }
        return intList;
    }
}

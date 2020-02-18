package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    HashTable<String, Integer> hTable;

    @Before
    public void init() {
        hTable = new HashTable<String, Integer>();
    }

    @Test
    public void hashTable_testAdd_SingleNode() {
        hTable.add("hours", 40);

        int index = hTable.hash("hours");
        HashNode<String, Integer> head = hTable.bucketArray.get(index);
        assertEquals(40, (Object)head.value);
    }

    @Test
    public void hashTable_testAdd_MultipleChaining() {
        hTable.add("hours", 40);
        hTable.add("hours", 35);
        hTable.add("hours", 25);

        int index = hTable.hash("hours");
        HashNode<String, Integer> head = hTable.bucketArray.get(index);
        assertEquals(25, (Object)head.value);

        head = head.next;
        assertEquals(35, (Object)head.value);

        head = head.next;
        assertEquals(40, (Object)head.value);
    }

    @Test
    public void hashTable_testGet_SingleValue() {
        hTable.add("hours", 40);
        Integer actual = hTable.get("hours");
        Integer expected = 40;
        assertEquals(expected, actual);
    }

    @Test
    public void hashTable_testGet_nullValue() {
        hTable.add("hours", 40);
        Integer actual = hTable.get("whoa");
        assertEquals(null, actual);
    }

    @Test
    public void hashTable_testGet_MultipleChaining() {
        hTable.add("hours", 40);
        hTable.add("shour", 35);
        hTable.add("shrou", 25);

        Integer actual = hTable.get("hours");
        Integer expected = 40;
        assertEquals(expected, actual);

        actual = hTable.get("shour");
        expected = 35;
        assertEquals(expected, actual);

        actual = hTable.get("shrou");
        expected = 25;
        assertEquals(expected, actual);

        int index = hTable.hash("hours");
        HashNode<String, Integer> head = hTable.bucketArray.get(index);
        assertEquals(25, (Object)head.value);

        head = head.next;
        assertEquals(35, (Object)head.value);

    }

    @Test
    public void hashTable_testContains() {
        hTable.add("hours", 40);

        assertTrue(hTable.contains("hours"));
    }

    @Test
    public void hashTable_testHash() {
        Integer actual = hTable.hash("hours");
        Integer actual2 = hTable.hash("shour");

        assertEquals(actual, actual2);
    }
}
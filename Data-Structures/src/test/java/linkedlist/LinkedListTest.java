package linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList<Integer> integerList;
    @Before
    public void initializeLinkedListWithIntegers() {

        integerList= new LinkedList<>();

        integerList.insert(22);
        integerList.insert(8);
        integerList.insert(54);
        integerList.insert(7);
        integerList.insert(900);
        integerList.insert(26);
        integerList.insert(22);
        integerList.insert(90);
        integerList.insert(900);
        integerList.insert(82);
        integerList.insert(58);
        integerList.insert(8);
    }

    @Test public void linkedList_testPopulatedListForValues() {

        assertEquals(8, (int)integerList.head.value);
        assertEquals(58, (int)integerList.head.next.value);
        assertEquals(82, (int)integerList.head.next.next.value);
        assertEquals(900, (int)integerList.head.next.next.next.value);
        assertEquals(90, (int)integerList.head.next.next.next.next.value);
        assertEquals(22, (int)integerList.head.next.next.next.next.next.value);
        assertEquals(26, (int)integerList.head.next.next.next.next.next.next.value);
        assertEquals(900, (int)integerList.head.next.next.next.next.next.next.next.value);
        assertEquals(7, (int)integerList.head.next.next.next.next.next.next.next.next.value);
        assertEquals(54, (int)integerList.head.next.next.next.next.next.next.next.next.next.value);
        assertEquals(8, (int)integerList.head.next.next.next.next.next.next.next.next.next.next.value);
        assertEquals(22, (int)integerList.head.next.next.next.next.next.next.next.next.next.next.next.value);

    }

    @Test public void linkedList_testEmptyList() {

        LinkedList<Integer> emptyIntegerList = new LinkedList<>();

        int expected = 0;
        int actual = emptyIntegerList.getSize();

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testInsertForSize() {

        int expected = 12;
        int actual = integerList.getSize();

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testInsertForToString() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        String expected = "{ 7 } -> { 54 } -> { 8 } -> { 22 } -> NULL";
        String actual = intLinkedList.toString();

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testHeadProperty() {

        int expected = 8;
        int actual = integerList.head.value;

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testIncludesForTrue() {

        boolean actual = integerList.includes(54);

        assertTrue(actual);
    }

    @Test public void linkedList_testIncludesForFalse() {

        boolean actual = integerList.includes(1);

        assertFalse(actual);
    }
}
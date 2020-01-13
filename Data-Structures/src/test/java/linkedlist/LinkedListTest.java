package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void linkedList_testEmptyList() {

        LinkedList<Integer> emptyIntegerList = new LinkedList<>();

        int expected = 0;
        int actual = emptyIntegerList.getSize();

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testInsertForSize() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        int expected = 4;
        int actual = intLinkedList.getSize();

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

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        int expected = 7;
        int actual = intLinkedList.head.value;

        assertEquals(expected, actual);
    }

    @Test public void linkedList_testIncludesForTrue() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        boolean actual = intLinkedList.includes(54);

        assertTrue(actual);
    }

    @Test public void linkedList_testIncludesForFalse() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        boolean actual = intLinkedList.includes(1);

        assertFalse(actual);
    }

    @Test public void linkedList_testToArray() {

        LinkedList<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.insert(22);
        intLinkedList.insert(8);
        intLinkedList.insert(54);
        intLinkedList.insert(7);

        Object[] actual = intLinkedList.toArray();
        Object[] expected = {7, 54, 8, 22};

        assertArrayEquals(expected, actual);

    }
}
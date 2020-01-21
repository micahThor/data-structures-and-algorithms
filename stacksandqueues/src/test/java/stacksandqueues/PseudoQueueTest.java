package stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue<Integer> pQueue;
    Integer expected;
    Integer actual;

    @Before
    public void init() {

        pQueue = new PseudoQueue<>();

        pQueue.enqueue(20);
        pQueue.enqueue(15);
        pQueue.enqueue(10);
    }

    @Test
    public void testPseudoQueue_enqueue() {
        // add a value and test
        pQueue.enqueue(5);
        expected = 5;
        actual = pQueue.mainStack.peek();
        assertEquals(expected, actual);

        // add second value and test
        pQueue.enqueue(1);
        expected = 1;
        actual = pQueue.mainStack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void testPseudoQueue_enqueueEmptyStack() {
        PseudoQueue<Integer> pQueueEmpty = new PseudoQueue<>();
        pQueueEmpty.enqueue(1);

        expected = 1;
        actual = pQueueEmpty.mainStack.peek();
    }

    @Test
    public void testPseudoQueue_dequeueUntilEmpty() {

        expected = 20;
        actual = pQueue.dequeue();
        assertEquals(expected, actual);
        expected = 15;
        actual = pQueue.dequeue();
        assertEquals(expected, actual);
        expected = 10;
        actual = pQueue.dequeue();
        assertEquals(expected, actual);
    }

    @Test (expected = java.util.EmptyStackException.class)
    public void testPseudoQueue_dequeueEmptyStack() {
        PseudoQueue<Integer> pQueueEmpty = new PseudoQueue<>();
        pQueueEmpty.dequeue();
    }

}

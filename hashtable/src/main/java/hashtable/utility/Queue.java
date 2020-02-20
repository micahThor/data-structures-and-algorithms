package hashtable.utility;

public class Queue<E> {

    public Node<E> front;
    public Node<E> back;

    public Queue() {
        this.front = this.back = null;
    }

    public void enqueue(E value) {
        Node newNode = new Node(value);

        if (this.front == null) {
            this.front = newNode;
            this.back = newNode;
        } else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public E dequeue() {
        if (this.front == null) {
            throw new java.util.NoSuchElementException();
        }

        E frontOfQueueValue = this.front.value;

        this.front = this.front.next;

        return frontOfQueueValue;
    }

    public E peek() {
        if (this.front.value == null) {
            return null;
        }
        return this.front.value;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    @Override
    public String toString() {
        StringBuilder queueStr = new StringBuilder();

        queueStr.append("FRONT -> ");

        Node<E> current = this.front;

        while (current != null) {
            queueStr.append("(");
            queueStr.append(current.value.toString());
            queueStr.append(") -> ");

            current = current.next;
        }

        queueStr.append("BACK");

        return queueStr.toString();
    }

    public class Node<E> {

        public E value;
        public Node<E> next;

        public Node(E val) {
            this.value = val;
        }
    }


}

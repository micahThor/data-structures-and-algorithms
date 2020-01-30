package utility;

public class Queue<E> {

    public qNode<E> front;
    public qNode<E> back;

    public Queue() {
        this.front = this.back = null;
    }

    public void enqueue(E value) {
        qNode newNode = new qNode(value);

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

    public boolean isEmpty() {
        return this.front == null;
    }

    public class qNode<E> {

        public E value;
        public qNode<E> next;

        public qNode(E val) {
            this.value = val;
        }
    }
}

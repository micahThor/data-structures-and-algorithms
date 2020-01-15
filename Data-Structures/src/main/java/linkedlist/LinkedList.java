package linkedlist;

public class LinkedList<E> {

    Node<E> head;
    static int size;

    public LinkedList() {
        this.head = null;
        size = 0;
    }

    public void insert(E value) {

        if (this.head == null) {
            this.head = new Node<>(value);
        } else {
            Node<E> newNode = new Node<>(value);
            newNode.next = this.head;
            this.head = newNode;
        }
        // increase size
        size++;
    }

    public boolean insertBefore(E value, E newVal) {

        Node<E> currentNode = this.head;

        while (currentNode.next != null) {

            if (currentNode.next.value.equals(value)) {
                // add node in position
                Node<E> newNode = new Node<>(newVal);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                // increase size
                size++;
                // set flag to true for successful insertBefore
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    public boolean insertAfter(E value, E newVal) {

        Node<E> currentNode = this.head;

        while (currentNode.next != null) {

            if (currentNode.value.equals(value)) {
                // add node in position
                Node<E> newNode = new Node<>(newVal);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                // increase size
                size++;
                // set flag to true for successful insertBefore
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void append(E value) {

        // handle empty case
        if (this.head == null) {
            head = new Node<>(value);
        } else {
            // else make new node
            Node<E> newNode = new Node<>(value);

            // traverse to end of list
            Node<E> currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            // link current last node to new node
            currentNode.next = newNode;
        }
        // increase size
        size++;
    }

    public boolean includes(E value) {

        Node<E> currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public E kthFromEnd(int k) {

        int target = this.getSize() - k - 1;
        if (target < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = head;

        while (target > 0) {
            currentNode = currentNode.next;
            target--;
        }

        return currentNode.value;
    }

    @Override
    public String toString() {

        StringBuilder listString = new StringBuilder();

        Node<E> currentNode = head;

        while (currentNode != null) {
            listString.append("{ ");
            listString.append(currentNode.value.toString());

            if (currentNode.next == null) {
                listString.append(" } -> NULL");
            } else {
                listString.append(" } -> ");
            }
            currentNode = currentNode.next;
        }

        return listString.toString();
    }

    public static class Node<E> {

        public E value;
        public Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }
}

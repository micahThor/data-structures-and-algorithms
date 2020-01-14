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

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

    public Object[] toArray() {

        Object[] collection = new Object[size];

        Node<E> currentNode = head;

        while (currentNode != null) {
            for (int i = 0; i < collection.length; i++) {
                collection[i] = currentNode.value;
                currentNode = currentNode.next;
            }
        }
        return collection;
    }

    @Override
    public String toString() {

        StringBuilder listString = new StringBuilder();

        if (this.head != null) {
            Node<E> currentNode = head;

            while (currentNode != null) {
                listString.append("{ ");
                listString.append(currentNode.value);

                if (currentNode.next == null) {
                    listString.append(" } -> NULL");
                } else {
                    listString.append(" } -> ");
                }
                currentNode = currentNode.next;
            }
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

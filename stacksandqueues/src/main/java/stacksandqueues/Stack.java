package stacksandqueues;

public class Stack<E> {

    public Node<E> top;

    public Stack() {
        this.top = null;
    }

    public void push(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.next = this.top;
        this.top = newNode;

    }

    public E pop() {
        if (this.isEmpty()) {
            throw new java.util.EmptyStackException();
        }

        E topOfStackValue = this.top.value;

        this.top = this.top.next;

        return topOfStackValue;
    }

    public E peek() {
        if (this.top.value == null) {
            return null;
        }
        E topOfStackValue = this.top.value;

        return topOfStackValue;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public String toString() {
        StringBuilder stackStr = new StringBuilder();

        stackStr.append("TOP -> ");

        Node<E> current = this.top;

        while (current != null) {
            stackStr.append("(");
            stackStr.append(current.value.toString());

            if (current.next != null) {
                stackStr.append(") -> ");
            } else {
                stackStr.append(")");
            }

            current = current.next;
        }

        return stackStr.toString();
    }
}

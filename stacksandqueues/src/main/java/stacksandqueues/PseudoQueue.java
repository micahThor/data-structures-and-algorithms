package stacksandqueues;

public class PseudoQueue<E> {

    public Stack<E> mainStack;
    private Stack<E> auxiliaryStack;

    public PseudoQueue() {
        this.mainStack = new Stack<>();
        this.auxiliaryStack = new Stack<>();
    }

    public void enqueue(E value) {

        this.mainStack.push(value);
    }

    public E dequeue() {

        while (!this.mainStack.isEmpty()) {
            auxiliaryStack.push(mainStack.pop());
        }

        E returnValue = auxiliaryStack.pop();

        while (!this.auxiliaryStack.isEmpty()) {
            mainStack.push(auxiliaryStack.pop());
        }

        return returnValue;
    }
}

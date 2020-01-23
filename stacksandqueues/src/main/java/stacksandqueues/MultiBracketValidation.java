package stacksandqueues;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {

        Queue<String> openBracketQueue = new Queue<>();
        Queue<String> closeBracketQueue = new Queue<>();
        int openBracketCounter = 0;
        int closeBracketCounter = 0;

        // populate the openingBracketQueue and closingBracketQueue with all brackets present in input string
        String[] strInputArray = input.split("");
        for (String str : strInputArray) {
            if (Brackets.isOpeningBracket(str)) {
                openBracketQueue.enqueue(str);
                openBracketCounter++;
            } else if (Brackets.isClosingBracket(str)) {
                closeBracketQueue.enqueue(str);
                closeBracketCounter++;
            }
        }

        // if the open bracket count doesn't equal close count, it wont match
        if (openBracketCounter != closeBracketCounter) {
            return false;
        }

        Stack<String> tempCloseBracketStorage = new Stack<>();
        String nextOpenBracket = null;

        while (!openBracketQueue.isEmpty()) {

            // dequeue the next closed bracket
            if (nextOpenBracket == null) {
                nextOpenBracket = openBracketQueue.dequeue();
            }

            // if top of openBracket queue matches top of closeBracket queue,
            // release those brackets
            // else add closing bracket to temp storage
            while (!closeBracketQueue.isEmpty()) {
                if (Brackets.isBalanced(nextOpenBracket, closeBracketQueue.peek())) {
                    nextOpenBracket = null;
                    closeBracketQueue.dequeue();
                } else {
                    tempCloseBracketStorage.push(closeBracketQueue.dequeue());
                }
            }

            while (!tempCloseBracketStorage.isEmpty()) {
                closeBracketQueue.enqueue(tempCloseBracketStorage.pop());
            }
        }

        // both queues have to be empty and nextOpenBracket has to be null to be true that all brackets found their match
        boolean returnCondition =  openBracketQueue.isEmpty() && closeBracketQueue.isEmpty() && nextOpenBracket == null;
        return returnCondition;

    }
}
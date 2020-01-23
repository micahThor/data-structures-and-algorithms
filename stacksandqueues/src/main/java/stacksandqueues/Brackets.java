package stacksandqueues;

public enum Brackets {

    OPENING_CURLY_BRACKET("{"),
    CLOSING_CURLY_BRACKET("}"),
    OPENING_ROUND_BRACKET("("),
    CLOSING_ROUND_BRACKET(")"),
    OPENING_SQUARE_BRACKET("["),
    CLOSING_SQUARE_BRACKET("]");

    private String bracket;

    Brackets(String bracket) {
        this.bracket = bracket;
    }

    public static boolean isOpeningBracket(String bracket) {
        return bracket.equals(OPENING_CURLY_BRACKET.toString()) ||
                bracket.equals(OPENING_ROUND_BRACKET.toString()) ||
                bracket.equals(OPENING_SQUARE_BRACKET.toString());
    }

    public static boolean isClosingBracket(String bracket) {
        return bracket.equals(CLOSING_CURLY_BRACKET.toString()) ||
                bracket.equals(CLOSING_ROUND_BRACKET.toString()) ||
                bracket.equals(CLOSING_SQUARE_BRACKET.toString());
    }

    public static boolean isBalanced(String bracketOpen, String bracketClose) {

        if (bracketOpen == null || bracketClose == null) {
            return false;
        }

        if (bracketOpen.equals(OPENING_CURLY_BRACKET.toString()) &&
                bracketClose.equals(CLOSING_CURLY_BRACKET.toString())) {
            return true;
        }

        if (bracketOpen.equals(OPENING_ROUND_BRACKET.toString()) &&
                bracketClose.equals(CLOSING_ROUND_BRACKET.toString())) {
            return true;
        }

        if (bracketOpen.equals(OPENING_SQUARE_BRACKET.toString()) &&
                bracketClose.equals(CLOSING_SQUARE_BRACKET.toString())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.bracket;
    }
}

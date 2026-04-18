import java.util.*;

public class NestedListParser {

    public ListComponent parse(String input) {
        Stack<ListComposite> stack = new Stack<>();
        ListComposite root = new ListComposite();
        stack.push(root);

        StringBuilder numberBuffer = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numberBuffer.append(ch);
            } else {
                // If we finished reading a number, add it
                if (numberBuffer.length() > 0) {
                    int value = Integer.parseInt(numberBuffer.toString());
                    stack.peek().addChild(stack.peek().getChildCount(), new Item(value));
                    numberBuffer.setLength(0);
                }

                if (ch == '[') {
                    ListComposite newList = new ListComposite();
                    stack.peek().addChild(stack.peek().getChildCount(), newList);
                    stack.push(newList);
                } else if (ch == ']') {
                    stack.pop();
                }
            }
        }

        return root.getChild(0); // Return actual parsed list
    }
}
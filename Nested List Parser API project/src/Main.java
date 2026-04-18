

public class Main {
    public static void main(String[] args) {
        String input = "[1 [2 3] [4 5] [6 4]]";

        NestedListParser parser = new NestedListParser();
        ListComponent result = parser.parse(input);

        result.printValue();  // Expected: [ 1 [ 2 3 ] [ 4 5 ] [ 6 4 ] ]
    }
}
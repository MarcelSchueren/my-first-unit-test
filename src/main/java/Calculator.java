public class Calculator {
    public static void main(String[] args) {
        int result = add(5, 5);
        System.out.println("Result: " + result);
        System.out.println("More than 20 chars : " + stringLength("Hallo"));
        System.err.println("Contains 'fancy' : " + containsFancy("Heyho fancy people"));
    }

    public static boolean stringLength(String s) {
        return s.length() > 20;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean containsFancy(String s) {
        return s.contains("fancy");
    }
}

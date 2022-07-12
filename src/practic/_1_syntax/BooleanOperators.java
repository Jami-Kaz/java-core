package practic._1_syntax;

public class BooleanOperators {
    public static void main(String[] args) {

    }

    static boolean bool(int x, int y) {
        boolean b1 = x > y;
        boolean b2 = x < y;

        boolean b3 = x == y;   // true если равны
        boolean b4 = x != y;   // true если не равны

        boolean b5 = x >= y;
        boolean b6 = x <= y;

        return b1 && b5 || b4 ^ b6;
    }
}

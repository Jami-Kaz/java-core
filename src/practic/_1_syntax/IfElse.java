package practic._1_syntax;

class IfElse {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 3;
        boolean b = (x == y);


        if (x > y) {
            System.out.println(x + " больше чем " + y);
        } else if (x < y) {
            System.out.println(x + " меньше чем " + y);
        } else {
            System.out.println(x + " равен " + y);
        }



        if (x == 1 && y == 1 && x == y) {
            System.out.println("Логическое И, все условия должны быть true");
        }

        if (x == 0 || y == 2) {
            System.out.println("Логическое ИЛИ, хоть одно условие должно быть true");
        }
        if ((x == 1 || y == 2) && x != y) {
            System.out.println();
        }

        if (y == 1 && (z = x) > 0) {
        }
            System.out.println(z);

        if (x == 1 ^ y == 2) {
            System.out.println();
        }


    }
}

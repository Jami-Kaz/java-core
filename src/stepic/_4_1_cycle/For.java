package stepic._4_1_cycle;

import java.util.Scanner;

public class For {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String result = ladder(3);
        System.out.println(result);
//        task_10();
    }

    //Напечатайте "лесенку" из чисел от единицы до n, n > 0.
//Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
//Sample Input:
//3
//Sample Output:
//1
//1 2
//1 2 3
    static String ladder(int num) {
//        int num = sc.nextInt();
        String res = "";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    res = res + j + "\n";
                } else {
                    res = res + j + " ";
                }
            }
        }
        return res;
    }

    //На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
//Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
//Примечание. Каждая строка вывода оканчивается числом, а не пробелом.
//Sample Input:
//1 2 3
//Sample Output:
//1 1 1 1
//4 8 16 32
//9 27 81 243
    static String multTable(Scanner sc) {
        int x;
        String res = "";
        while (sc.hasNext()) {
            x = sc.nextInt();
            res = res + ((x * x) + " " + (x * x * x) + " " + (x * x * x * x) + " " + (x * x * x * x * x)) + "\n";
        }
        return res;

//        for (int n; sc.hasNext(); ) {
//            n = sc.nextInt();
//            System.out.println((n * n) + " " + (n*n*n) + " " + (n*n*n*n) + " " + (n*n*n*n*n));
//        }
    }

    //На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.
    static String stars(int x, int y) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        String res = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                res = res + "*";
            }
            res = res + "\n";
        }
        return res;
    }

    //на вход подаётся два натуральных числа - n и m. Напечатайте число n, повторённое m раз в одной строке через пробел.
    static String getNM(int n, int m) {
//        int n = sc.nextInt();
//        for (int m = sc.nextInt(); m != 0; m--) {
//            System.out.print(n + " ");
//        }
        String res = "";
        for (; m != 0; m--) {
            res = res + n + " ";
        }
        return res;
    }

    //На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n включительно, которые одновременно без остатка делятся на 2 и на 3. Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
    static String task_1(int n) {
//        boolean not = true;
//        for (int iter = 1; sc.nextInt() >= iter; iter++) {
//            if (iter % 2 == 0 && iter % 3 == 0) {
//                System.out.print(iter + " ");
//                not = false;
//            }
//        }
//        if (not) {
//            System.out.print("Таких чисел нет");
//        }
        boolean not = true;
        String res = "";
        for (int iter = 1; n >= iter; iter++) {
            if (iter % 2 == 0 && iter % 3 == 0) {
                res = res + iter + " ";
                not = false;
            }
        }
        if (not) {
            res = "Таких чисел нет";
        }
        return res;

    }


}

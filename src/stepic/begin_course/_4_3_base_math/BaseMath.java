package stepic.begin_course._4_3_base_math;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BaseMath {

    InputStream console = System.in;
    Scanner sc1 = new Scanner(console);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String result = piNSymbols(0, Math.PI);
        System.out.println(result);
    }


    //Дано число 0 <= n <= 10. Выведите число pi с точностью n знаков после запятой. Воспользуйтесь
// константой PI из класса Math.
//Sample Input:
//3
//Sample Output:
//3.142
    static String piNSymbols(int n, double pi) {
        String res = "";
        if (n >= 0 && n <= 10) {
            String form = "%." + n + "f";
             res = String.format(form, pi);
        }
        return res;
    }

    //Дан угол α градусов. Выведите y=sin(α)+cos(α)..
//Sample Input:
//90
//Sample Output:
//1.0
    static void task6() {
        int a = sc.nextInt();
        double rad = Math.toRadians(a);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);

        System.out.println(sin + cos);
    }

    //Дан угол a градусов. Выведите значение угла в радианах.
    static double toRadians(int a) {
//        int a = sc.nextInt();
//        System.out.println(Math.toRadians(a));
        return Math.toRadians(a);
    }

    // Решите задачу, которой учителя мучают многие поколения школьников. Что больше, e^pi или pi^e? В ответе выведите соответствующий знак (<, > или =).
    static char powEquals(double e, double pi) {
//        double e = 2.7182818284;
//        double pi = 3.1415926535;
//        double e1 = Math.pow(e, pi);
//        double pi1 = Math.pow(pi, e);
//        if (e1 > pi1) {
//            System.out.println(">");
//        } else if (pi1 > e1) {
//            System.out.println("<");
//        } else {
//            System.out.println("=");
//        }
        double e1 = Math.pow(e, pi);
        double pi1 = Math.pow(pi, e);
        if (e1 > pi1) {
            return '>';
        } else if (pi1 > e1) {
            return '<';
        } else {
            return '=';
        }

    }

    // На вход подаются два числа, x и y. Выведите на печать x^y.
    static double pow(int x, int y) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(Math.pow(x, y));
        return Math.pow(x, y);
    }

}


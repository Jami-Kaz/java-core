package stepic._4_3_base_math;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class BaseMath {

    InputStream console = System.in;
    Scanner sc1 = new Scanner(console);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
//        double e = Math.E;
//        double pi = Math.PI;
//        double pow = Math.pow(e, pi);
//
//        System.out.println(e);
//        System.out.println(pi);
//        System.out.println(pow);

        task10();
    }
//На вход подаются длины двух катетов прямоугольного треугольника a и b. Посчитайте и выведите
// на печать периметр этого треугольника. Значение периметра необходимо округлить до целого
// (в математическом смысле, не типа int).
//Sample Input:
//3 4
//Sample Output:
//12.0
    static void task10() {

    }
// Даны числа x, y и n. Выведите sqrt[n]{x^{y}} Выведите ответ с точностью 5 знаков после запятой.
// Гарантируется, что выражение имеет действительное значение. Результат выведите в виде числа
// типа double. Примечание. Если в ответе получается число с количеством знаков после запятой
// меньше, чем 5, выводить дополнительные нули не нужно!
//Sample Input:
//5 3 2
//Sample Output:
//11.18034
    static void task9() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

    }
//Дано число 0 <= n <= 10. Выведите число pi с точностью n знаков после запятой. Воспользуйтесь
// константой PI из класса Math.
//Sample Input:
//3
//Sample Output:
//3.142
    static void task8() {
        int n = sc.nextInt();
        double pi = Math.PI;
        if (n > 0) {
            String form = String.format("%.3f", pi);
            System.out.println(form);
        }
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
//    Дан угол a градусов. Выведите значение угла в радианах.
    static void task5() {
        int a = sc.nextInt();
        System.out.println(Math.toRadians(a));
    }
// Решите задачу, которой учителя мучают многие поколения школьников. Что больше, e^pi или pi^e?
//В ответе выведите соответствующий знак (<, > или =).
    static void task3() {
        double e = 2.7182818284;
        double pi = 3.1415926535;
        double e1 = Math.pow(e, pi);
        double pi1 = Math.pow(pi, e);
        if (e1 > pi1) {
            System.out.println(">");
        }
        else if (pi1 > e1) {
            System.out.println("<");
        }
        else {
            System.out.println("=");
        }
    }
// На вход подаются два числа, x и y. Выведите на печать x^y.
    static void task2() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.pow(x, y));
    }

}


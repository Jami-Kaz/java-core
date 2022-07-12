package stepic._4_1_cycle;

import java.util.Scanner;

public class For {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task_2();
    }
//на вход подаётся два натуральных числа - n и m. Напечатайте число n, повторённое m раз в одной строке через пробел.
    static void task_2() {
        int n = sc.nextInt();
        for (int m = sc.nextInt(); m != 0; m--) {
            System.out.print(n + " ");
        }
    }

    //На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n включительно, которые одновременно без остатка делятся на 2 и на 3. Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
    static void task_1() {
        boolean not = true;
        for (int iter = 1; sc.nextInt() >= iter; iter++) {
            if (iter % 2 == 0 && iter % 3 == 0) {
                System.out.print(iter + " ");
                not = false;
            }
        }
        if (not) {
            System.out.print("Таких чисел нет");
        }
    }


}

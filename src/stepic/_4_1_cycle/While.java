package stepic._4_1_cycle;

import java.util.Scanner;

public class While {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            task_9();
        }

    //На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов. Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно). Вывести слова необходимо в том же порядке, в котором они подаются на вход.
    static void task_9() {
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        String word;
        while (sc.hasNext()) {
            word = sc.next();
            if ((word.charAt(0) >= ch1 && word.charAt(0) <= ch2)) {
                System.out.println(word);
            }
        }
    }

    //На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
    static void task_8() {
        String st = sc.next();   // max index 0 - 4
        int len = st.length();   // 5
        while (0 < len) {
            System.out.print(st.charAt(len = len - 1));
        }
    }

    //На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями. Если входящее число отрицательное или больше 10, последовательность прерывается. Посчитайте среднюю оценку фильма.
    static void task_7() {
        double sum = 0;
        double count =0;
        double sr = 0;
        int num;
        while ((num = sc.nextInt()) <= 10 && num >= 0) {
            sum = sum + num;
            count = count + 1;
            sr = sum / count;
        }
        System.out.println(sr);
    }

    //На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность). Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
    static void task_6() {
        int count = 0;
        int sum = 0;
        int x;
        while ((x = sc.nextInt()) % 11 == 0) {
            count = count + 1;
            if (x % 3 == 0) {
                sum = sum + x;
            }
        }
        System.out.println(count + "\n" + sum);
    }
    //Завершите программу таким образом, чтобы она вывела числа от 1 до 5, каждое на новой строке.
    static void task_5() {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x < 6);
    }
    // На вход подаётся последовательность слов. Посчитайте общее количество введённых слов. Примечание. Так как маркер конца последовательности в этой задаче отсутствует, будет удобно воспользоваться методом hasNext(). Найдите самостоятельно, как он работает.
    static void task_4() {
        int res = 0;
        while (sc.hasNext()) {
            sc.next();
            res = res + 1;
        }
        System.out.println(res);
    }

    //Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0. Выведите на печать сумму введённых чисел.
    static void task_3() {
        int res = 0;
        int x;
        while ((x = sc.nextInt()) != 0) {
            res = res + x;
        }
        System.out.println(res);
    }

    //На ввод подаётся натуральное число n. Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
    static void task_2() {
        int n = sc.nextInt();
        int x = 1;
        int x2;
        while ((x2 = x * x) <= n) {
            System.out.print(x2 + " ");
            x++;
        }
    }

    // На вход подаётся натуральное число n. Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.
    static void task_1() {
        int x = sc.nextInt();
        int y = 1;
        while (x >= y) {
            System.out.println(y);
            y++;
        }
    }

}

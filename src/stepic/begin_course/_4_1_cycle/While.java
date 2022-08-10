package stepic.begin_course._4_1_cycle;

import java.io.InputStream;
import java.util.Scanner;

public class While {
    static Scanner sc = new Scanner(System.in);
//    static int num = 12345;


    public static void main(String[] args) {
            String result = numRevert(12345);
        System.out.println(result);


        }

    //На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов. Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно). Вывести слова необходимо в том же порядке, в котором они подаются на вход.
    static String filterByAbs(InputStream in) {
        Scanner sc = new Scanner(in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        String word;
        String resText = "";
        while (sc.hasNext()) {
            word = sc.next();
            if ((word.charAt(0) >= ch1 && word.charAt(0) <= ch2)) {
               resText = resText + word + "\n";
            }
        }
        return resText;

    }

    //На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
    static String numRevert(int n) {

        String st = String.valueOf(n);   // max index 0 - 4
        int len = st.length();   // 5
        String res ="";
        while (0 < len) {
            res = res + st.charAt(len = len - 1);
        }
        return res;
    }

    //На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями. Если входящее число отрицательное или больше 10, последовательность прерывается. Посчитайте среднюю оценку фильма.
    static double getMoveRating(Scanner sc) {
        double sum = 0;
        double count =0;
        double average = 0;
        int num;
        while ((num = sc.nextInt()) <= 10 && num >= 0) {
            sum = sum + num;
            count = count + 1;
            average = sum / count;
        }
        return average;
    }

    //На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11 (это число не входит в последовательность). Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
    static String getCountAndSum(Scanner sc) {
        int count = 0;
        int sum = 0;
        int x;
        while ((x = sc.nextInt()) % 11 == 0) {
            count = count + 1;
            if (x % 3 == 0) {
                sum = sum + x;
            }
        }
        return count + "\n" + sum;
    }
    //Завершите программу таким образом, чтобы она вывела числа от 1 до 5, каждое на новой строке.
    static String doFiveWhile() {
        int i = 1;
        String res = "";
        do {
            res = res + i + "\n";
            i++;
        } while (i < 6);
        return res;
    }
    // На вход подаётся последовательность слов. Посчитайте общее количество введённых слов. Примечание. Так как маркер конца последовательности в этой задаче отсутствует, будет удобно воспользоваться методом hasNext(). Найдите самостоятельно, как он работает.
    static int wordCount(Scanner sc) {
        int res = 0;
        while (sc.hasNext()) {
            sc.next();
            res = res + 1;
        }
        return res;
    }

    //Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0. Выведите на печать сумму введённых чисел.
    static int getSum(Scanner scanner) {
        int res = 0;
        int x;
        while ((x = scanner.nextInt()) != 0) {
            res = res + x;
        }
        return res;
    }

    //На ввод подаётся натуральное число n. Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
    static String multipleTo(int n) {
//        int n = sc.nextInt();
//        int x = 1;
//        int x2;
//        while ((x2 = x * x) <= n) {
//            System.out.print(x2 + " ");
//            x++;
//        }
         int x = 1;
        int x2;
        String res = "";
        while ((x2 = x * x) <= n) {
            res = res + x2 + " ";

            x++;
        }
        return res;


    }

    // На вход подаётся натуральное число n. Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.
    static String iterTo(int n) {
//        int x = sc.nextInt();
//        int y = 1;
//        while (x >= y) {
//            System.out.println(y);
//            y++;
//        }
        int i = 1;
        String res = "";
        while (n >= i) {
            res = res + i + "\n";
            i++;
        }
        return res;


    }

}

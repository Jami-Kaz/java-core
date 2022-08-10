package stepic.begin_course._5_3_array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(minSum(8, 7, 6, 5, 4, 3, 2));
    }

    static void task6() {
        int[][] arr;

                arr = new int[][]{
                        {2, 5, 7},
                        {6, 7, 9}};

    }

//Дана последовательность целых чисел. Определите минимальную сумму пар элементов массива,
//. Если таких пар нет, выведите 0.
    static int minSum(int... seq) {
        int res = 0;
        for (int i = 0; i < seq.length; i++) {
            for (int j = i + 1; j < seq.length; j++) {
                int sum = seq[i] + seq[j];
                if (sum < res || (i == 0 && j == 1)) {
                    res = sum;
                }
            }
        }
        return res;
    }
//На вход подаётся строка текста. Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать. Если таких слов несколько, выведите номер первого по порядку.
    static int wordMinLength(String text) {
//        String text = sc.nextLine();
        String[] wordsArr = text.split(" ");
        int resIndex = 0;

        for (int i = 1; i < wordsArr.length; i++) {
            if (wordsArr[i].length() < wordsArr[resIndex].length()) {
                resIndex = i;
            }
         }
        return resIndex + 1;
    }

    //На ввод подаётся последовательность целых чисел. Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.), кроме первого и последнего. Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
    static int[] elementChange(int... seq) {
//        String nums = sc.nextLine();
//        String[] numsArr = nums.split(" ");
//        int[] res = new int[numsArr.length];
//        String result = "";
//
//        for (int i = 0; i < res.length; i++) {
//            res[i] = Integer.parseInt(numsArr[i]);
//        }
        for (int j = 1; j < seq.length - 2; j += 2) {
            int temp = seq[j];
            seq[j] = seq[j + 1];
            seq[j + 1] = temp;
        }
   return seq;
    }
}

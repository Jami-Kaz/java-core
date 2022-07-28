package stepic._5_3_array_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task6();
    }

    static void task6() {
        int[][] arr;

                arr = new int[][]{
                        {2, 5, 7},
                        {6, 7, 9}};

    }

//Дана последовательность целых чисел. Определите минимальную сумму пар элементов массива,
// расстояние (разница) между индексами которых равно 2. Если таких пар нет, выведите 0.
//Sample Input:
//8 7 6 5 4 3 2
//Sample Output:
//6
    static void task5() {
    }
//На вход подаётся строка текста. Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать. Если таких слов несколько, выведите номер первого по порядку.
    static void task4() {
        String words = sc.nextLine();
        String[] wordsArr = words.split(" ");
        int resIndex = 0;

        for (int i = 1; i < wordsArr.length; i++) {
            if (wordsArr[i].length() < wordsArr[resIndex].length()) {
                resIndex = i;
            }
         }
        System.out.print(resIndex + 1);
    }

    //На ввод подаётся последовательность целых чисел. Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.), кроме первого и последнего. Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
    static void task3() {
        String nums = sc.nextLine();
        String[] numsArr = nums.split(" ");
        int[] res = new int[numsArr.length];
        String result = "";

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(numsArr[i]);
        }

        for (int j = 1; j < res.length - 2; j = j + 2) {
            int temp = res[j];
            res[j] = res[j + 1];
            res[j + 1] = temp;
        }

        for (int i = 0; i < res.length; i++) {
            result = result + " " + res[i];
        }
        System.out.println(result);
    }


}

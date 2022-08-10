package stepic.begin_course._5_1_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String result = arrayFromString("y, i,o,p,p");
        System.out.println(result);
//        task13();
    }

    //На вход подаётся строка из элементов, разделённых запятой. Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
    static String arrayFromString(String lineElem) {
        String[] elem = lineElem.split(",");
        String res = "";
        for (String el : elem) {
            res = res + el + "\n";
        }
        return res;
    }

    //На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел. Выведите на печать все числа, большие предыдущего числа.
    static int[] arrayFromLarge(int size, int... sequence) {
        int resSize = 0;
        for (int j = 0; j < size - 1; j++) {
            if (sequence[j + 1] > sequence[j]) {
                resSize++;
            }
        }
        int[] res = new int[resSize];
        for (int j = 0, i = 0; j < sequence.length - 1; j++) {
            if (sequence[j + 1] > sequence[j]) {
                res[i] = sequence[j + 1];
                i++;
            }
        }
        return res;

    }

    //На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно). Выведите на печать массив в одной строке, через пробел. Посчитайте и выведите на печать сумму элементов массива.
    static int[] evenArrayTo(int size) {
        int[] evens = new int[size / 2 + 1];
        int gen = 2;
        int sum = 0;
        for (int i = 0; i < evens.length - 1; gen++) {
            if (gen % 2 == 0) {
                evens[i] = gen;
                i++;
            }
        }
        for (int k = 0; k < evens.length; k++) {
            sum = sum + evens[k];
        }
        evens[evens.length - 1] = sum;
        return evens;
    }

    //На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
    static int idFromArray(int size, int id, int... sequence) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sequence[i];
        }
        return arr[id];
    }

    //На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел. Создайте из неё массив и выведите на печать значение последнего элемента массива.
    static int endFromArray(int size, int... sequence) {
        int[] arr = new int[size];   // создаем массив
        for (int i = 0; i < size; i++) {
            arr[i] = sequence[i];      // заполняем массив элементами со сканер
        }

        return arr[size - 1];
    }

    //На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
    static int[] arrayTo(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {   // записываем числа в массив
            arr[i] = i + 1;
        }
        return arr;
    }

}

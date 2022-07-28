package stepic._5_1_arrays;

import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task15();
    }

//На вход подаётся строка из элементов, разделённых запятой. Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
    static void task15() {
        String lineElem = sc.nextLine();
        String[] elem = lineElem.split(",");
        for (String el: elem) {
            System.out.println(el);
        }
    }

//На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел. Выведите на печать все числа, большие предыдущего числа.
    static void task13() {
        int[] nums = new int[sc.nextInt()];
        String res = "";

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j + 1] > nums[j]) {
                res = res + nums[j + 1] + " ";
            }
        }

        System.out.print(res);

    }
//На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно). Выведите на печать массив в одной строке, через пробел. Посчитайте и выведите на печать сумму элементов массива.
    static void task12() {
        int n = sc.nextInt();
        int[] chet = new int[n / 2];
        String res = "";
        int gen = 2;
        int sum = 0;

        for (int i = 0; i < chet.length ; gen++) {
            if (gen % 2 == 0) {
                chet[i] = gen;
                i++;
            }
        }
        for (int j = 0; j < chet.length; j++) {
            res = res + chet[j] + ((j == chet.length - 1) ? "" : " ");
        }
        for (int k = 0; k < chet.length; k++) {
            sum = sum + chet[k];
        }
        System.out.print(res + "\n" + sum);
    }
//На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
    static void task11() {
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[sc.nextInt()]);

    }
    //На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел. Создайте из неё массив и выведите на печать значение последнего элемента массива.
    static void task10() {
        int size = sc.nextInt();    // длина массива
        int[] arr = new int[size];   // создаем массив

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();      // заполняем массив элементами со сканер
        }

        System.out.print(arr[size - 1]);
    }

    //На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
    static void task8() {
        int[] arr = new int[sc.nextInt()];
        String res = "";

        for (int i = 0; i < arr.length; i++) {   // записываем числа в массив
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {    // сохраняем результат в строку
            res = res + arr[i] + " ";
        }
        System.out.print(res);
    }

}

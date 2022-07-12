package practic._2_core;

import java.util.Scanner;

public class Scanners {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int i = (int) sc.nextDouble();   // возвращает следующее дробное число
            int n = sc.nextInt();            // возвращает следующее целое число

        if (sc.hasNextInt()) {           // true если есть следующее целое число
            System.out.println("число");
        }
        else if (sc.hasNext()) {         // true если есть следующее слово до пробела
            System.out.println("строка");
        }



    }
}

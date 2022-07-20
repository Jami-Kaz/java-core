package practic._2_core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner strScan = new Scanner("1 Jami super");
        Scanner fileScan = new Scanner(new File("films.txt"));
        Scanner consScan = new Scanner(System.in);

        System.out.println(fileScan.nextLine());

        int i = (int) consScan.nextDouble();   // возвращает следующее дробное число
            int n = consScan.nextInt();            // возвращает следующее целое число

        if (consScan.hasNextInt()) {           // true если есть следующее целое число
            System.out.println("число");
        }
        else if (consScan.hasNext()) {         // true если есть следующее слово до пробела
            System.out.println("строка");
        }



    }
}

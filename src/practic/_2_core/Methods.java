package practic._2_core;

import java.util.Scanner;

public class Methods {

    static int i = 3;

    public static void main(String[] args) {
//        System.out.println(i());
//        System.out.println(i);

        i = 4;

//        v(5);

        System.out.println( i("xka") );
//        System.out.println(qva());

    }

    static void v(int c) {
        System.out.println(c * c);
    }

    static int i(String st) {
        return st.length();
    }

    static double d() {
        return 4.2;
    }

    static boolean b() {
        return true;
    }

    static String s() {
        return "jami";
    }

    static Scanner sc() {
        return new Scanner(System.in);
    }


}

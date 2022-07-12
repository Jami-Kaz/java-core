package practic._1_syntax;

import java.util.Scanner;

class While {

    static int u = in();
    Scanner scx;

    public static void main(String[] args) {

        int x = u;
        boolean v;

        while (sc().hasNext()) {

            x += 10;

            System.out.println(x);

        }
    }


    static void vo() {
    }

    static int in() {
        return 7;
    }

    static boolean bo() {
        return true;
    }

    static String st() {
        return "";
    }

    static Scanner sc() {
        return new Scanner(System.in);
    }
}

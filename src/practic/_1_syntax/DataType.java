package practic._1_syntax;

import java.util.Scanner;

class DataType {

    /**
     *      primitive types
     */
    byte b = 127 - 128;          // 8
    short s = -32000;            // 16
    char c = 65000;              // 16

    int i = 2_000_000_000;       // 32
    float f = 2.9f;              // 32

    long l = 9_000_000_000_000L; // 64
    double d = 9.9d;             // 64

    boolean bo = true == false;


    /**
     *      reference types
     */
    char[] chars = {'k', 'i', 'p'};
    int[] ints = new int[3];
    String string = "";
    Scanner scanner = new Scanner(string);
    Object object = new double[6];


}
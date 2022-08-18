package practic._1_syntax;

class Primitive {

    public static void main(String[] args) {

        byte b = 127 - 128;          // 8
        short s = -32000;            // 16
        char c = 65000;              // 16

        int i = 2_000_000_000;       // 32
        float f = 2.9f;              // 32

        long l = 9_000_000_000_000L; // 64
        double d = 9.9d;             // 64

        boolean bo = true == false;

        bo = c > 'h';

        char   cha = 65000;
        double dou = l;
        byte   byt = (byte) d;

        boolean boo = bo == true;



    }
}
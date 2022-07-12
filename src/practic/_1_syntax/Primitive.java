package practic._1_syntax;

class Primitive {

    public static void main(String[] args) {

        byte    b = 127 - 128;
        short   s = 32540 - 32000;
        char    c = 'h';
        int     i = 2_100_000_000 - 2_000_000_000;
        long    l = 9_100_100_000_000L - 9_000_000_000_000L;
        float   f = 999914445.992f - 99994415.992f;
        double  d = 1266655555.4 - 1266655555.4;

        boolean bo = c > 'h';

        char   cha = 65000;
        double dou = l;
        byte   byt = (byte) d;

        boolean boo = bo == true;



    }
}
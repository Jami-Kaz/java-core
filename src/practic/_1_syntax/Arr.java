package practic._1_syntax;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {

        byte[] bytes;
        String[] strings;

        double[] doubles = new double[5];
        doubles[0] = 2.1;

        bytes = new byte[]{3, 5};
        strings = new String[]{"xa", "fa"};

        int[] arr = {3, 4, 8, 9, 6};
        int i = arr[3];
        arr[0] = 9;

        String j = "jami";
        char[] ch = {'j', 'a', 'm', 'i'};

        System.out.println(Arrays.toString(ch));


//        System.out.println(i);
//        System.out.println(arr[0]);
//        System.out.println(doubles[0]);
    }
}

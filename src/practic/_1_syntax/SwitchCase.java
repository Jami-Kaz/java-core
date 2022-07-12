package practic._1_syntax;

public class SwitchCase {

    public static void main(String[] args) {

        int x = 2;

        switch (x) {
            case 4:
                System.out.println("x = 4");
                break;
            case 6:
                System.out.println("x = 6");
                break;
            case 7:
                System.out.println("x = 7");
                break;
            case 9:
                System.out.println("x = 9");
            default:
                System.out.println("xyi");
        }


        switch ("x" + "y") {

            case "cas":
                System.out.println("cas");
                break;
            case "xy":
                System.out.println("xy");
        }


    }
}

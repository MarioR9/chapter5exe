import java.util.InputMismatchException;
import java.util.Scanner;


public class chapter5 {

    public static void main(String[] args) {
        findRoot();
        fullName();
        numberCharacter();
    }

    private static void findRoot() {
        //prompt user to enter number
        System.out.println("Enter number to find the Sqr root");
        Scanner key = new Scanner(System.in);
        //math sqrt.
        int sqr = key.nextInt();
        int result = (int) Math.sqrt(sqr);
        System.out.println("The square root of " + sqr + " is :" + result);
    }

    private static void fullName() {
        //Prompt User
        Scanner key = new Scanner(System.in);
        System.out.println("Enter full name");
        //Spli first and last name
        String st = key.nextLine();
        String[] str = st.split(" ");
        System.out.println("Hello Mr.Mrs. " + str[1] + " " + str[0]);
    }

    private static void numberCharacter() {
        System.out.println("Enter number or a character");
        Scanner input = new Scanner(System.in);
        try {
            int number = input.nextInt();
            System.out.println("Binary: " + Integer.toBinaryString(number));
            String x = Integer.toHexString(number);
            System.out.println("Hexadecimal: " + x);

        } catch (InputMismatchException ex) {

            String x = input.nextLine();
            char[] ch = x.toCharArray();
            StringBuilder toHex = new StringBuilder();
            for (char c : ch) {
                int i = (int) c;
                toHex.append(Integer.toHexString(i).toUpperCase());
                System.out.println("Hex = " + toHex.toString());

                StringBuilder toBinary = new StringBuilder();
                for (char c1 : ch) {
                    int ii = (int) c;
                    toBinary.append(Integer.toBinaryString(i).toUpperCase());
                    System.out.println("Binary = " + toBinary.toString());
                }
            }
        }
    }
}

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        String binary ="";
        while (n>0) {
            binary = (n%2)+binary;
            n=n/2;
        }
//        int decimal = sc.nextInt();
//        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number: " + binary);
        sc.close();
    }
}

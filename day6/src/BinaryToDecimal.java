import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
//        int binary = sc.nextInt();
//        int decimal = 0;
//        int power = 0;
//        while (binary>0){
//            int digit = binary%10;
//            decimal = decimal + digit*(int)Math.pow(2,power);
//            power++;
//            binary = binary/10;
//        }
        int binary = sc.nextInt();
        int decimal = Integer.parseInt(String.valueOf(binary), 2);
        System.out.println("decimal number: " + decimal);
        sc.close();
    }
}

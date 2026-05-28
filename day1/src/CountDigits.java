import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp !=0){
           temp = temp/10;
           count++;
        }
        if (num == 0){
            count = 1;
        }
        System.out.println ("Number of digits = " + count);
                sc.close();
    }
}

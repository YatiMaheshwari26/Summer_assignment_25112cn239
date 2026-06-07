import java.util.Scanner;
public class RecursiveReverse {
    static int rev = 0;
    static int reverse(int n){
        if (n==0)
            return rev;
        rev = rev*10 + n%10;
        return reverse(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reversed = reverse(num);
        System.out.println("The reversed number is: " + reversed);
        sc.close();
    }
}

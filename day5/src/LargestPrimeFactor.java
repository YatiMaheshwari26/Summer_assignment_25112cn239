import java.util.Scanner;
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int largestPrimeFactor = 1;
        for (int i = 2; i <= num; i++){
            while(num % i == 0){
                largestPrimeFactor = i;
                num = num / i;
            }
        }
        System.out.println("The largest prime factor is " + largestPrimeFactor);
        sc.close();
    }
}

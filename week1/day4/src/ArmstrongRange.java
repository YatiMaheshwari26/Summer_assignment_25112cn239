import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting number: ");
        int start=sc.nextInt();
        System.out.println("enter ending number: ");
        int end=sc.nextInt();
        System.out.println("Armstrong numbers in the range are: ");
        for (int i=start; i<=end; i++){
            int num=i;
            int sum=0, digit;
            while(num>0){
                digit=num%10;
                sum= sum + digit*digit*digit;
                num=num/10;
            }
            if (sum==i){
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}

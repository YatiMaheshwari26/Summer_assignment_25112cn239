import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int originalNum = num;
        int sum=0, digit;
        while(num>0){
            digit=num%10;
            sum = sum + (digit*digit*digit);
            num=num/10;
        }
        if(sum==originalNum){
            System.out.println("The Armstrong number is "+originalNum);
        } else {
            System.out.println("The Armstrong number is not "+originalNum);
        }
        sc.close();
    }
}

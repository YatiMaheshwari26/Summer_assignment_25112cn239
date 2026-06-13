import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) if (arr[i] % 2 == 0) evenCount++;
        else oddCount++;
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        sc.close();
    }
}

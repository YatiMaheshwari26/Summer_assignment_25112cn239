import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!visited[ch]) {
                result += ch;
                visited[ch] = true;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

public class PerfectNumberFunction {
    static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 28;
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number");
        }  else {
            System.out.println(num + " is not a perfect number");
        }
    }
}

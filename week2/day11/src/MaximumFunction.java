public class MaximumFunction {
    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }  else {
            return b;
        }
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;
        int max = findMax(num1,num2);
        System.out.println("max= " + max);
    }
}

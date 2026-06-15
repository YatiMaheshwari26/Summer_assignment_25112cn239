public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 1, 3};
        int sum = 8;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}

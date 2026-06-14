public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if element has already appeared before
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            // Check for duplicates ahead
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

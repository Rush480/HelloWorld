import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 3, 14, 16, 8, 34, 76, 990, 212, 55, 1, 5, 7, 2, 90, 21, 576, 89, 223, 456};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
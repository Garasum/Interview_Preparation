import java.util.Arrays;

/**
 * Created by orest.harasym on 7/9/2018.
 *
 * Swapping bigger element to the right
 */
public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    System.out.println("arr = " + Arrays.toString(arr));
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //BubbleSort
        BubbleSort.bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
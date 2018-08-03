import java.util.Arrays;

/**
 * Created by orest.harasym on 7/9/2018.
 * In selection sort algorithm, we search for the lowest element and arrange it to the proper location.
 * We swap the current element with the next lowest number.
 * <p>
 * <p>
 * The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.
 * <p>
 * The subarray is already sorted.
 * And the second subarray is unsorted.
 * <p>
 * With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.
 */

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            System.out.println("array = " + Arrays.toString(arr));
        }
    }

    public static void main(String a[]) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
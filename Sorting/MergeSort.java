
import java.util.Arrays;

public class MergeSort {

    static void sort(int[] arr,int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Divide
        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        // Combine
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy left half
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy right half
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Compare and merge
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } 
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining left elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10, 19};

        System.out.println("Before sorting: "
                + Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("After sorting: "
                + Arrays.toString(arr));
    }
}
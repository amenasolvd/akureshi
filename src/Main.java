// Programm: Sorting an Array using Heap sorting method
//Programmer: Amena Kureshi
//Date: Oct 26, 2023
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 12, 9, 3, 10, 15, 56, 23, 58, 11, 2, 45, 36, 78, 89, 25, 64, 0};
        System.out.println("Original Array is:   ");
        System.out.println(Arrays.toString(arr));
        Sort ob = new Sort();
        ob.heapSort(arr);
        System.out.println("Sorted Array is:     ");
        System.out.println(Arrays.toString(arr));

    }
}
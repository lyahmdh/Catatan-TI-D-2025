import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
 int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // shallow copy (referensi sama)
        arr2[0] = 99;
        System.out.println("\nSetelah ubah arr2[0]=99, arr1[0] = " + arr1[0]);
    }
}
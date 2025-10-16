import java.util.Arrays;
import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {

         // ===== Akses Elemen Array =====
        //  System.out.println("Elemen ke-0 array a = " + a[0]);
        //  System.out.println("Elemen ke-3 array b = " + b[3]);

         // ===== Loop untuk Menampilkan Elemen Array =====
        // System.out.println("\nIsi array a:");
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println("a[" + i + "] = " + a[i]);
        // }

        // loop for each
        // int jumlah = 0;
        // for (int nilai : b) jumlah += nilai;
        // System.out.println("\nJumlah semua elemen array b = " + jumlah);
        // loop for
        // int jumlah2 = 0;
        // for (int i = 0; i < b.length; i++) {
        //     jumlah2 += b[i];
        // }
        // System.out.println("\nJumlah semua elemen array b = " + jumlah2);
        
        // int[] arr1 = {1, 2, 3};
        // //int[] arr2 = arr1; // shallow copy (referensi sama)
        
        // int[] arr3 = Arrays.copyOf(arr1, arr1.length); // deep copy
        // arr3[0] = 7;
        // System.out.println("Setelah ubah arr3[0]=7, arr1[0] tetap = " + arr1[0]);

        int[][][] kubus1 = {
            {{1, 2, 3}, {4, 5, 6}}, {{1, 2, 3}, {1, 2, 3}}
        };

        for (int i = 0; i < kubus1.length; i++) {
            for (int j = 0; j < kubus1.length; j++) {
                for (int j2 = 0; j2 < kubus1.length; j2++) {
                    System.out.println(kubus1[i][j][j2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
 int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // shallow copy (referensi sama)
        arr2[0] = 99;
        System.out.println("\nSetelah ubah arr2[0]=99, arr1[0] = " + arr1[0]);
    }
}
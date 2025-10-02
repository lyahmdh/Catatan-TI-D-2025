// Catatan Tambahan Materi Array di Java
// Di luar PPT: default value, copy array, Arrays utility, for-each loop, dll.

import java.util.Arrays;
import java.util.ArrayList;

public class modul4 {
    public static void main(String[] args) {
        
        // ===== 1. Default Value Elemen Array =====
        int[] angka = new int[3];        // default 0
        String[] kata = new String[3];  // default null
        System.out.println("Default value int[0] = " + angka[0]);
        System.out.println("Default value String[0] = " + kata[0]);

        // ===== 2. Shallow Copy vs Deep Copy =====
        int[] a = {1, 2, 3};
        int[] b = a;              // shallow copy (referensi sama)
        b[0] = 99;
        System.out.println("\nSetelah ubah b[0]=99, nilai a[0] = " + a[0]);

        // deep copy pakai Arrays.copyOf
        int[] c = Arrays.copyOf(a, a.length);
        c[0] = 7;
        System.out.println("Setelah ubah c[0]=7, nilai a[0] tetap = " + a[0]);

        // ===== 3. Utility Class Arrays =====
        int[] data = {5, 3, 8, 1};
        Arrays.sort(data); // sorting
        System.out.println("\nIsi array setelah sort: " + Arrays.toString(data));
        int pos = Arrays.binarySearch(data, 5);
        System.out.println("Posisi elemen 5 setelah sort = " + pos);

        // ===== 4. For-each Loop =====
        System.out.println("\nLooping dengan for-each:");
        for (int nilai : data) {
            System.out.println(nilai);
        }

        // ===== 5. Array 3 Dimensi =====
        int[][][] kubus = new int[2][2][2];
        kubus[0][1][1] = 10;
        System.out.println("\nIsi kubus[0][1][1] = " + kubus[0][1][1]);

        // ===== 6. Array sebagai Parameter dan Return Value =====
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("\nJumlah elemen arr = " + jumlahkan(arr));

        int[] hasil = buatArray();
        System.out.println("Array hasil dari method: " + Arrays.toString(hasil));

        // ===== 7. Perbandingan Array vs ArrayList =====
        // Array → fixed size
        String[] namaArray = new String[3];
        namaArray[0] = "Ani";
        namaArray[1] = "Budi";
        namaArray[2] = "Citra";

        // ArrayList → fleksibel (dinamis)
        ArrayList<String> namaList = new ArrayList<>();
        namaList.add("Ani");
        namaList.add("Budi");
        namaList.add("Citra");
        namaList.add("Dewi"); // bisa nambah terus

        System.out.println("\nArray biasa: " + Arrays.toString(namaArray));
        System.out.println("ArrayList: " + namaList);
    }

    // Method dengan parameter array
    public static int jumlahkan(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    // Method return array
    public static int[] buatArray() {
        return new int[]{10, 20, 30};
    }
}

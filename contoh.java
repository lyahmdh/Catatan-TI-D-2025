import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        int[] b = {1, 2, -4, 8, 9};

        int jumlah2 = 0;
        for (int i = 0; i < b.length; i++) {
            jumlah2 += b[i];
        }
        System.out.println("\nJumlah semua elemen array b = " + jumlah2);
    }
}
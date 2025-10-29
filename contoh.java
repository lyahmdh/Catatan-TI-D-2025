import java.util.Arrays;
import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        String messy = "Hello!!!    ##World123";
        messy = messy.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] kata = messy.split("\\s+");
        System.out.println("Kata & Panjang:");
        for (String k : kata) {
            System.out.println("- " + k + " (" + k.length() + ")");
        }
    }
}
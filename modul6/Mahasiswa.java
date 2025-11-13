// ===============================================================
//  Modul Praktikum Pemrograman Dasar 2025
//  BAB 6: CLASS DAN OBJECT
//  File: Mahasiswa.java
// ===============================================================

public class Mahasiswa {

    // ===========================================================
    // 🔹 Variabel Global (Instance Variables)
    // ===========================================================
    private String nama;
    private String nim;
    private double ipk;

    // ===========================================================
    // 🔹 Variabel Global Static (Class Variable)
    // Bersifat milik class, dibagikan ke semua objek.
    // ===========================================================
    private static String universitas = "Universitas Brawijaya";

    // ===========================================================
    // 🔹 Constructor (Method khusus untuk inisialisasi objek)
    // ===========================================================
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // ===========================================================
    // 🔹 Non-static Method
    // Hanya bisa dipanggil melalui objek (instance).
    // ===========================================================
    public void tampilData() {
        // Variabel lokal (hanya hidup di dalam method ini)
        String status;
        if (ipk >= 3.5) {
            status = "Cumlaude";
        } else {
            status = "Reguler";
        }

        // Menampilkan data mahasiswa
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("IPK         : " + ipk);
        System.out.println("Status      : " + status);
        System.out.println("Universitas : " + universitas);
        System.out.println("--------------------------------");
    }

    // ===========================================================
    // 🔹 Getter dan Setter
    // Contoh penerapan ENKAPSULASI (Encapsulation)
    // Atribut dibuat private, diakses lewat method public.
    // ===========================================================
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid!");
        }
    }

    // ===========================================================
    // 🔹 Static Method
    // Bisa dipanggil langsung lewat nama class tanpa membuat objek.
    // ===========================================================
    public static void infoKampus() {
        System.out.println("Selamat datang di " + universitas + "!");
    }

    // Method static lain untuk mengubah nama universitas
    public static void ubahUniversitas(String namaBaru) {
        universitas = namaBaru;
    }

    // ===========================================================
    // 🔹 Contoh Perbandingan Static dan Non-Static
    // Non-static method dapat mengakses semua atribut instance.
    // Static method hanya dapat mengakses variabel static.
    // ===========================================================
    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }
}

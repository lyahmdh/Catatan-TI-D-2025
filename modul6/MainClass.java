// ===============================================================
//  Modul Praktikum Pemrograman Dasar 2025
//  BAB 6: CLASS DAN OBJECT
//  File: MainClass.java
// ===============================================================

public class MainClass {
    public static void main(String[] args) {
        System.out.println("===== PRAKTIKUM BAB 6: CLASS DAN OBJECT =====\n");

        // =======================================================
        // 1️⃣ Memanggil Static Method (tanpa objek)
        // =======================================================
        Mahasiswa.infoKampus();

        // =======================================================
        // 2️⃣ Membuat Objek (Instance)
        // =======================================================
        Mahasiswa m1 = new Mahasiswa("Alya", "245150707111013", 3.85);
        Mahasiswa m2 = new Mahasiswa("Dira", "245150707111020", 3.20);
        Mahasiswa m3 = new Mahasiswa("Rafi", "245150707111030", 3.90);

        // =======================================================
        // 3️⃣ Menampilkan Data (Non-static Method)
        // =======================================================
        System.out.println("\n=== DATA MAHASISWA ===");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        // =======================================================
        // 4️⃣ Menggunakan Setter untuk Mengubah Atribut Private
        // =======================================================
        m1.setNama("Alya Maharani");
        m1.setIpk(3.95);

        System.out.println("Setelah data Alya diubah:");
        System.out.println("Nama baru: " + m1.getNama());
        System.out.println("IPK baru : " + m1.getIpk());
        System.out.println("--------------------------------");

        // =======================================================
        // 5️⃣ Perbedaan Variabel Primitif dan Referensi
        // =======================================================
        int a = 10;
        int b = a; // nilai disalin
        b = 20;
        System.out.println("\nNilai a = " + a + " (tidak berubah)");
        System.out.println("Nilai b = " + b + " (berubah sendiri)");

        // Variabel referensi menunjuk ke objek yang sama
        Mahasiswa ref1 = new Mahasiswa("Bima", "245150707111040", 3.5);
        Mahasiswa ref2 = ref1; // menunjuk ke objek yang sama
        ref2.ubahNama("Rani");
        System.out.println("Nama di ref1 setelah diubah ref2: " + ref1.getNama());
        System.out.println("--------------------------------");

        // =======================================================
        // 6️⃣ Array of Objects
        // =======================================================
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Sinta", "245150707111050", 3.60),
            new Mahasiswa("Gilang", "245150707111060", 3.75),
            new Mahasiswa("Rafi", "245150707111070", 3.90)
        };

        System.out.println("\n=== ARRAY OF OBJECTS ===");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            daftarMhs[i].tampilData();
        }

        // =======================================================
        // 7️⃣ Static Variable (berlaku untuk semua objek)
        // =======================================================
        System.out.println("Universitas sebelum diubah:");
        m1.tampilData();

        // Mengubah variabel static melalui method static
        Mahasiswa.ubahUniversitas("Universitas Indonesia");

        System.out.println("Setelah universitas diubah:");
        m1.tampilData();
        m2.tampilData();

        // =======================================================
        // 8️⃣ Variabel Lokal di Main()
        // =======================================================
        int tahunSekarang = 2025; // hanya hidup di dalam main()
        System.out.println("Tahun sekarang: " + tahunSekarang);

        System.out.println("\n===== SELESAI =====");
    }
}

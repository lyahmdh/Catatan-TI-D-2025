public class MainClass {
    public static void main(String[] args) {
        System.out.println("===== PRAKTIKUM BAB 6: CLASS DAN OBJECT =====\n");

        // Static Method
        Mahasiswa.infoKampus();

        // Contoh Penggunaan Berbagai Constructor
        System.out.println("\n=== DEMO CONSTRUCTOR OVERLOADING ===");

        // Constructor 1 (tanpa parameter)
        Mahasiswa m1 = new Mahasiswa();

        // Constructor 2 (hanya nama dan nim)
        Mahasiswa m2 = new Mahasiswa("Alya", "245150707111013");

        // Constructor 3 (lengkap)
        Mahasiswa m3 = new Mahasiswa("Dira", "245150707111020", 3.85);

        // Menampilkan hasil
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        // Mengubah data menggunakan Setter (Encapsulation)
        m2.setIpk(3.70);
        m2.setNama("Alya Maharani");

        System.out.println("Setelah diubah melalui Setter:");
        m2.tampilData();

        // Variabel Primitif vs Referensi
        int a = 10;
        int b = a; //10
        b = 20; //Apa a ikut berubah?
        System.out.println("Nilai a: " + a + " | Nilai b: " + b);

        Mahasiswa ref1 = new Mahasiswa("Bima", "245150707111030", 3.6);
        Mahasiswa ref2 = ref1;
        ref2.setNama("Rani");
        System.out.println("Nama ref1 setelah diubah ref2: " + ref1.getNama());

        // Array of Objects
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Sinta", "245150707111040", 3.6),
            new Mahasiswa("Gilang", "245150707111050", 3.9),
            new Mahasiswa("Rafi", "245150707111060", 3.8)
        };

        System.out.println("\n=== ARRAY OF OBJECTS ===");
        for (Mahasiswa m : daftarMhs) {
            m.tampilData();
        }

        // Static Variable Demonstration
        System.out.println("Universitas sebelum diubah:");
        m1.tampilData();

        Mahasiswa.ubahUniversitas("Universitas Indonesia");

        System.out.println("Setelah universitas diubah:");
        m1.tampilData();
        m2.tampilData();

        // Variabel Lokal
        int tahunSekarang = 2025; // hanya hidup di dalam main
        System.out.println("Tahun sekarang: " + tahunSekarang);

        System.out.println("\n===== SELESAI =====");
    }
}

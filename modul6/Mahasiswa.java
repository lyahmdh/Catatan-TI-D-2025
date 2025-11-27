public class Mahasiswa {

    // Variabel Global (Instance Variables)
    static String nama;
    private String nim;
    private double ipk;

    // Variabel Global Static (milik class)
    private static String universitas = "Universitas Brawijaya";

    // Constructor 1 (Default / Tanpa Parameter)
    // Digunakan kalau kita belum punya data apapun.
    public Mahasiswa() {
        this.nama = "Tidak diketahui";
        this.nim = "000000000";
        this.ipk = 0.0;
    }

    // Constructor 2 (Hanya Nama dan NIM)
    // Cocok untuk input data awal tanpa IPK.
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = 0.0; // IPK default
    }

    // Constructor 3 (Lengkap: Nama, NIM, IPK)
    // Inilah versi penuh constructor.
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Non-static Method untuk Menampilkan Data
    public void tampilData() {
        // Variabel lokal
        String status;
        if (ipk >= 3.5) {
            status = "Cumlaude";
        } else {
            status = "Reguler";
        }

        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("IPK         : " + ipk);
        System.out.println("Status      : " + status);
        System.out.println("Universitas : " + universitas);
        System.out.println("--------------------------------");
    }

    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("⚠️ IPK tidak valid!");
        }
    }

    // Static Method (Bisa dipanggil tanpa objek)
    public static void infoKampus() {
        System.out.println("Selamat datang di " + universitas + "!");
    }

    public static void ubahUniversitas(String namaBaru) {
        universitas = namaBaru;
    }
}

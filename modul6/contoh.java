public class contoh {
    public static void main(String[] args) {
                // Constructor 1 (tanpa parameter)
        Mahasiswa m1 = new Mahasiswa();

        // Constructor 2 (hanya nama dan nim)
        Mahasiswa m2 = new Mahasiswa("Alya", "245150707111013");

        
        System.out.println("Universitas sebelum diubah:");
        m1.tampilData();

        Mahasiswa.ubahUniversitas("Universitas Indonesia");

        m2.setIpk(3.70);
        m2.setNama("Alya Maharani");

        System.out.println("Setelah universitas diubah:");
        m1.tampilData();
        m2.tampilData();
    }
}

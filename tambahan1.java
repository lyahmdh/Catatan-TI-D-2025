public class tambahan1 {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_ref_string.asp


        // 1. charAt(int index)
        // ============================================================
        // Deskripsi:
        // Mengambil karakter pada posisi index (dimulai dari 0).
        // Jika index di luar jangkauan (negatif atau >= length()), maka error.
        String s1 = "Hello";
        System.out.println("charAt(0): " + s1.charAt(0));  // 'H'
        System.out.println("charAt(4): " + s1.charAt(4));  // 'o'


        // 2. concat(String str)
        // ============================================================
        // Deskripsi:
        // Menggabungkan string asal dengan string lain.
        // Karena String immutable, hasilnya string baru, bukan mengubah yang lama.
        String a = "Java";
        String b = "Programming";
        String c = a.concat(" ").concat(b);
        System.out.println("concat: " + c); // "Java Programming"


        // 3. equals(Object anObject) & equalsIgnoreCase(String anotherString)
        // ===================================================================
        // Deskripsi:
        // - equals() → membandingkan isi string secara case-sensitive
        // - equalsIgnoreCase() → membandingkan isi string tanpa memperhatikan besar kecil huruf
        String e1 = "Hello";
        String e2 = "hello";
        System.out.println("equals: " + e1.equals(e2));                // false
        System.out.println("equalsIgnoreCase: " + e1.equalsIgnoreCase(e2)); // true


        // 4. toUpperCase() dan toLowerCase()
        // ============================================================
        // Deskripsi:
        // Mengubah seluruh huruf dalam string menjadi huruf besar / kecil.
        // String asal tidak berubah karena sifat immutable.
        String caseStr = "JaVa";
        System.out.println("toUpperCase: " + caseStr.toUpperCase()); // "JAVA"
        System.out.println("toLowerCase: " + caseStr.toLowerCase()); // "java"


        // 5. substring(int beginIndex, [int endIndex])
        // ============================================================
        // Deskripsi:
        // Mengambil sebagian dari string:
        // - substring(beginIndex) → dari posisi beginIndex hingga akhir
        // - substring(beginIndex, endIndex) → dari beginIndex hingga sebelum endIndex
        // Jika indeks tidak valid, akan error.
        String subStr = "Programming";
        System.out.println("substring(3): " + subStr.substring(3));       // "gramming"
        System.out.println("substring(0, 3): " + subStr.substring(0, 3)); // "Pro"


        // 6. trim()
        // ============================================================
        // Deskripsi:
        // Menghapus spasi di awal dan akhir string, tapi tidak di tengah.
        String t = "   hello world   ";
        System.out.println("trim: '" + t.trim() + "'"); // "hello world"


        // 7. split(String regex)
        // ============================================================
        // Deskripsi:
        // Memecah string menjadi array String[], berdasarkan pemisah (regex).
        // Jika regex berisi karakter khusus, perlu di-escape (misal "\\s+" untuk spasi).
        String fruits = "apple,banana,kiwi";
        String[] parts = fruits.split(",");
        System.out.print("split: ");
        for (String part : parts) {
            System.out.print(part + " ");
        }
        System.out.println();


        // 8. replaceAll(String regex, String replacement)
        // ============================================================
        // Deskripsi:
        // Mengganti semua bagian string yang cocok dengan regex ke string baru.
        // Contoh: mengganti huruf vokal dengan '*', mengganti digit dengan '#', dsb.
        String rep = "tomato sauce";
        System.out.println("replaceAll: " + rep.replaceAll("o", "*")); // "t*mat* sauce"


        // 9. length()
        // ============================================================
        // Deskripsi:
        // Mengembalikan jumlah karakter dalam string.
        // Catatan: Berbeda dengan .length (tanpa kurung) pada array.
        String len = "Hello World";
        System.out.println("length: " + len.length()); // 11


        // 10. Studi Kasus Gabungan
        // ============================================================
        // Deskripsi:
        // Menggunakan beberapa method sekaligus dalam konteks nyata.
        System.out.println("\\n=== Studi Kasus ===");

        
        // --- Kasus 1: Normalisasi Nama ---
        // Input: "  nya jAtIkA  "
        // Tujuan:
        // - hapus spasi di awal/akhir (trim)
        // - ubah ke huruf kecil semua (toLowerCase)
        // - ubah huruf pertama tiap kata jadi besar (charAt + substring)
        String nama = "  nya jAtIkA  ";
        nama = nama.trim().toLowerCase();
        String[] words = nama.split(" ");
        StringBuilder proper = new StringBuilder();
        for (String w : words) {
            if (w.isEmpty()) continue;
            proper.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1))
                  .append(" ");
        }
        System.out.println("Normalisasi Nama: '" + proper.toString().trim() + "'");


        // --- Kasus 2: Validasi dan Pemisahan Email ---
        // Input: "  Alice@Example.COM  "
        // Langkah:
        // - trim() → hapus spasi
        // - toLowerCase() → ubah semua huruf jadi kecil
        // - split("@") → pisahkan username dan domain
        // - equals() → cek apakah domain == "example.com"
        String email = "  Alice@Example.COM  ";
        email = email.trim().toLowerCase();
        String[] emailParts = email.split("@");
        if (emailParts.length == 2) {
            String domain = emailParts[1];
            if (domain.equals("example.com"))
                System.out.println("Domain valid: " + domain);
            else
                System.out.println("Domain tidak valid: " + domain);
        }


        // --- Kasus 3: Penghapusan Karakter Tidak Diinginkan ---
        // Input: "Hello!!! ##World123"
        // Langkah:
        // - replaceAll("[^a-zA-Z\\s]", "") → hapus semua non-huruf/spasi
        // - toLowerCase() → ubah ke huruf kecil
        // - split("\\s+") → pisahkan kata berdasarkan spasi
        // - length() → hitung panjang tiap kata
        String messy = "Hello!!! ##World123";
        messy = messy.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] kata = messy.split("\\s+");
        System.out.println("Kata & Panjang:");
        for (String k : kata) {
            System.out.println("- " + k + " (" + k.length() + ")");
        }
    }
}

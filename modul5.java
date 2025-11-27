public class modul5 {

    //ini namanya main method yaa
    public static void main(String[] args) {
        // luasLingkaranVoid(7);
        // luasLingkaranVoid(8);
        // luasLingkaranVoid(9);

        // sama saja dengan:
        // float luasLingkaran1 = 7 * 7 * 3.14f;
        // System.out.println(luasLingkaran1);

        // float luasLingkaran2 = 8 * 8 * 3.14f;
        // System.out.println(luasLingkaran2);

        // float luasLingkaran3 = 9 * 9 * 3.14f;
        // System.out.println(luasLingkaran3);

        // method recursive faktorial
        // System.out.println(faktorial(5));
    }

    // --------------------------------------------------------
    
    // method? function? procedure?
    // di java hanya ada method ya! tetapi di beberapa bahasa lain memang dibedakan antara function dan procedure (mungkin ditanya di UAS)

    // method jenis void disebut juga procedure
    // method jenis return type disebut juga function

    // cara panggil method itu gimana?
    // tinggal ketik aja namanya dan jangan lupa isi parameternya
    // panggil method di bawah itu caranya tinggal:
    // testStatic();

    // pastikan bahwa method hanya dipanggil di MAIN METHOD !!

    // bagian bagian method:

    // modifier - static - type - nama method (parameter1, parameter2, ...) 

    // ada 2 type method:
    // void
    // return type: int, String, boolean, float, double

    public static void testStatic() {
        System.out.println("Ini adalah percobaan");
    }

    public static void testStatic(String test1) {
        System.out.println(test1);
        //kode di sini akan dijalankan kalo panggil testStatic("haloo"); di main method
    }


    // yang optional yang mana aja?
    // bagian modifier, sama parameter-parameter itu TIDAK WAJIB yaa


    // --------------------------------------------------------


    //berdasarkan method testStatic() di atas, kata kunci untuk jenis methodnya kata yang mana? 
    // jawaban : void
    
    // void biasanya dipake untuk mempersingkat kode yang perlu PRINT banyak linee
    // void TIDAK BOLEH dipanggil di variable ataupun di print out:
    // methodVoid();   cara panggilnya cuma boleh ginii


    // lanjut ke arguments ya!! argument itu bagian kurung setelah nama method 
    // argument tanpa parameter
    static void tampilkanHello() {
        System.out.println("Hello, World!");
    }
    //cara panggil: tampilkanHello();
    
    // argument dengan 1 parameter
    static void tampilkanHello(String nama) {
        System.out.println("Hello, " + nama + "!");
    }
    //cara panggil: tampilkanHello("Tom");

    // argument dengan 2 parameter
    static void tampilkanHello(String nama, int umur) {
        System.out.println("Halo, " + nama + "! Aku berumur" + umur);
    }
    //cara panggil: tampilkanHello("Tom", "Jerry");

    //urutan pengisian parameter HARUS DIPERHATIKAN
    //pengisiannya harus sesuai dengan saat method dibuat
    //misal: tampilkanHello("namaku", "nama teman");


    // --------------------------------------------------------


    //method return type HARUS ada keyword 'return' untuk mengembalikan nilainya yaa
    //kebalikan dari method void, method return type justru biasanya dipake dalam print, atau untuk isi variable
    // int simpanMethod = methodReturn();
    // System.out.println(methodReturn());

    // return berisi proses
    static double luasLingkaran(float jariJari) {
        return Math.pow(jariJari, 2)*3.14;
    }

    // return berisi nilai kembali dari variabel yang ada di dalam method
    // static double luasLingkaran(float jariJari) {
    //     double luasLingkaran1 = Math.pow(jariJari, 2)*3.14;
    //     return luasLingkaran1;
    // }

    //suatu method boleh pake method lain di dalamnya~
    static double volTabung(float jariJari, float tinggi) {
        double volTabung = luasLingkaran(jariJari) * tinggi;
        return volTabung;
    }

    static void luasLingkaranVoid(float jariJari) {
        float luasLingkaran = jariJari * jariJari * 3.14f;
        System.out.println(luasLingkaran);
    }

    //bikin method untuk cari luas segitiga siku-siku jika diketahui alas dan tingginya 
    public static void luasSegitiga (double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        System.out.println(luas);
    }

    //kalau pake method return type, tapi ga pake argument, itu sama aja variable ya gais ya


    
    // --------------------------------------------------------


    //overriding vs overloading?
    //di praktikum kalian cuma akan pakai overloading yaa
    //overloading: nama methodnya sama tapi jumlah parameter dalam argumentnya beda




    static void tampilkanNama() {
        System.out.println("Nama saya Fei dari kelas TI C");
    }

    static void tampilkanNama(String nama){
        System.out.println("Nama saya " + nama + " dari kelas TI C");
    }

    static void tampilkanNama(String nama, String kelas) {
        System.out.println("Nama saya " + nama + " dari kelas " + kelas);
    }

    //tips method yang sering dipake:
    //method untuk return boolean biasanya dinamakan is(Something)(parameter)
    //contohnya:

    static boolean isMale(String gender) {
        return gender.equalsIgnoreCase("Pria");
    }

    static boolean isTiketAnak(int umur) {
        return umur < 5;
    }

    // dengan adanya method tersebut, kamu bisa ganti kode yang sama dalam satu method
    // kalau ga pake method, kamu harus ganti kode yang sama berulang kali di program


    // method recursive (memanggil methodnya sendiri dalam isinya)

    static int methodApaHayoo(int i) {
        if (i <= 1) {
            return i;
        } else {
            return methodApaHayoo(i-1) + methodApaHayoo(i-2); //bagian recursion
        }
    }
  
    //    0                  1                1
    //    0,                 1,             (0)+(1),        (1)+(1),         (1)+(1+1)         (1+1)+(1+1+1)
    //  i = 0              i = 1             i = 2            i = 3            i = 4              i = 5
    //fibonacci(i-2)   fibonacci(i-1)     fibonacci(2)

    static int faktorial(int n) {
        if (n == 1 || n == 0) {
            return 1; // base case: 0! = 1 dan 1! = 1
        } else {
            return n * faktorial(n - 1); // recursive case
        }
    }
    
    // faktorial(5)
    // = 5 × faktorial(4)
    // = 5 × (4 × faktorial(3))
    // = 5 × (4 × (3 × faktorial(2)))
    // = 5 × (4 × (3 × (2 × faktorial(1))))
    // = 5 × (4 × (3 × (2 × 1)))
    // = 120

}

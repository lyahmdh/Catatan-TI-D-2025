public class modul2 {
    public static void main (String[] args) {

        //logical operator
        // && --> AND
        // || --> OR
        // == --> sama dengan
        // [variabel].equals([variabel2]) --> membandingkan 2 var beda dgn variabel
        // [variabel].equals("ini kata")  --> tanpa menggunakan var pembanding

        String hewan1 = "Ayam";
        String hewan2 = "ayam";
        System.out.println(hewan1 == hewan2); //jangan biasakan pakai ini
        System.out.println(hewan1.equals(hewan2)); //biasakan pakai ini
        System.out.println(hewan1.equals("Ayam"));
        System.out.println(hewan1.equalsIgnoreCase(hewan2));

        // != --> tidak sama dengan
        // >  --> lebih dari
        // <  --> kurang dari
        // >= --> lebih dari sama dengan
        // <= --> kurang dari sama dengan
        // !  --> NOT, mengembalikan nilai boolean

        boolean kitaMahasiswa = false;
        System.out.println("Apakah kita mahasiswa?" + (!kitaMahasiswa));

        // if else
        double ipk = 3.5;

        // style 1 (standart)
        if (ipk >= 3) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda gagal");
        }

        // style 2
        if (ipk >= 3)
        {
            System.out.println("Anda lulus");
        }
        else
        {
            System.out.println("Anda gagal");
        }

        // else if
        

    }
}

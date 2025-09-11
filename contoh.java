import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT DATA

        //Keterangan beberapa variabel input :
        //PawKwh : posisi awal Kwh Meter
        //PakKwh : posisi akhir Kwh Meter
        //konversiPPJ : pengubahan PPJ dari persen ke bentuk rupiah

        System.out.println("Program Perhitungan Pemakaian Listrik Sederhana");
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Kelurahan : ");
        String kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter  : ");
        int PawKwh = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter : ");
        int PakKwh = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini   : ");
        int biayaBeban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)     : ");
        float ppj = input.nextFloat();
        
        //PROCESS

        int besarPemakaian = PakKwh-PawKwh; 
        int tarifListrik = biayaBeban*besarPemakaian;
        float konversiPPJ = (tarifListrik*(ppj/100));
        //float konversiPPJ = (tarifListrik*(ppj/100));
        float totalBayar = tarifListrik+konversiPPJ;

        //OUTPUT

        System.out.println("===================PLN Java===================");
        System.out.println("Nama                : " +nama);
        System.out.println("Kelurahan           : " +kelurahan);
        System.out.println("Pemakaian bulan ini : " +besarPemakaian +" Kwh Meter");
        System.out.println("Tarif Listrik       : Rp " + (int) tarifListrik +",-");
        System.out.println("PPJ 10%             : Rp " + (int) konversiPPJ +",-");
        System.out.println("Total Bayar         : Rp " + (int) totalBayar + ",-");
        System.out.println("==============================================");

        input.close();
    }
    

}
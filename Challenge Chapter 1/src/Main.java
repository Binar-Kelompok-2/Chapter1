import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);
    static String random;
    static int s, t, a, hasil_int, pilih_bidang;
    static double phi, setengah, j, hasil_double;

    public static void main(String[] args) {
        menu();
        menu();
        menu();
    }

     private static void menu(){
         System.out.println("-------------------------------------");
         System.out.println("KALKULATOR PENGHITUNG LUAS DAN VOLUME");
         System.out.println("-------------------------------------");
         System.out.println("Menu");
         System.out.println("1. Hitung Luas Bidang");
         System.out.println("2. Keluar");
         System.out.println("-------------------------------------");
        int pilihan = input.nextInt();
         switch (pilihan) {
             case 1 -> PilihBidangLuas();
             case 2 -> System.out.println("Terimakasih");
             default -> {
                 System.out.println("Pilihan Salah");
                 menu();
             }
         }
    }
    private static void PilihBidangLuas(){
        System.out.println("-------------------------------------");
        System.out.println("PILIH BIDANG YANG AKAN DIHITUNG");
        System.out.println("-------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("5. Kembali Ke Menu Utama");
        System.out.println("-------------------------------------");
        pilih_bidang = input.nextInt();
        if(pilih_bidang == 1){
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Persegi");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Sisi Persegi : ");
            s = input.nextInt();
            hasil_int = s*s;
            System.out.println("\nProcessing...");
            System.out.println(hasil_int);
            System.out.println("Tekan apa untuk kembali ke menu utama");
            random = input.next();
            menu();
        }
        else if(pilih_bidang == 2){
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Lingkaran");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Jari-Jari Lingkaran : ");
            j = input.nextInt();
            phi = 3.14;
            hasil_double = j*phi;
            System.out.println("\nProcessing...");
            System.out.println(hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            random = input.next();
            menu();
        }
        else if(pilih_bidang == 3){
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Segitiga");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Alas Segitiga : ");
            a = input.nextInt();
            System.out.print("Masukan Tinggi Segitu=iga : ");
            t = input.nextInt();
            setengah = 0.5;
            hasil_double = a*t*setengah;
            System.out.println("\nProcessing...");
            System.out.println(hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            random = input.next();
            menu();
        }
        else{
            System.out.print("Inputan Salah");
            PilihBidangLuas();
        }
    }
}

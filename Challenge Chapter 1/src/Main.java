import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String random;
    static int p, l, s, t, a, hasil_int, pilih_bidang;
    static double phi, setengah, j, hasil_double;
    
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("KALKULATOR PENGHITUNG LUAS DAN VOLUME");
        System.out.println("-------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Luas Volume");
        System.out.println("0. Keluar");
        System.out.println("-------------------------------------");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1 -> PilihBidangLuas();
            case 2 -> PilihBidangVolume(); //lamda digunakan agar otomatis break
            case 0 -> System.out.println("Terimakasih"); break;

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
        System.out.println("0. Kembali Ke Menu Utama");
        System.out.println("-------------------------------------");
        pilih_bidang = input.nextInt();
        if(pilih_bidang == 1) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Persegi");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Sisi Persegi : ");
            s = input.nextInt();
            hasil_int = s*s;
            System.out.println("\nProcessing...");
            System.out.println("Luas dari persegi adalah " + hasil_int);
            System.out.println("Tekan apa untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();
        } else if(pilih_bidang == 2) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Lingkaran");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Jari-Jari Lingkaran : ");
            j = input.nextInt();
            phi = 3.14;
            hasil_double = j*phi;
            System.out.println("\nProcessing...");
            System.out.println("Luas dari lingkaran adalah " + hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();
        } else if(pilih_bidang == 3) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Segitiga");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Alas Segitiga : ");
            a = input.nextInt();
            System.out.print("Masukan Tinggi Segitiga : ");
            t = input.nextInt();
            setengah = 0.5;
            hasil_double = a*t*setengah;
            System.out.println("\nProcessing...");
            System.out.println("Luas dari segitiga adalah " + hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();
        } else if(pilih_bidang == 4) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Persegi Panjang");
            System.out.println("-------------------------------------");

            System.out.print("Masukan Sisi Panjang Persegi Panjang : ");
            p = input.nextInt();
            System.out.print("Masukan Sisi Lebar Persegi Panjang : ");
            l = input.nextInt();
            hasil_double = p*l;
            System.out.println("\nProcessing...");
            System.out.println("Luas dari persegi panjang adalah " + hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();

        } else if(pilih_bidang == 0) {
            menu();
        } else {
            System.out.print("Inputan Salah");
            PilihBidangLuas();
        }
    }

    private static void PilihBidangVolume() {
        System.out.println("-------------------------------------");
        System.out.println("PILIH BIDANG YANG AKAN DIHITUNG");
        System.out.println("-------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali Ke Menu Utama");
        System.out.println("-------------------------------------");
        pilih_bidang = input.nextInt();
        if (pilih_bidang == 1) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Kubus");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Sisi Kubus : ");
            s = input.nextInt();
            hasil_int = s * s * s;
            System.out.println("\nProcessing...");
            System.out.println("Volume dari kubus adalah " + hasil_int);
            System.out.println(" ");
            System.out.println("-------------------------------------");
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }

            menu();
        } else if (pilih_bidang == 2) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Balok");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Panjang Balok: ");
            p = input.nextInt();
            System.out.print("Masukan Lebar Balok: ");
            l = input.nextInt();
            System.out.print("Masukan Tinggi Balok : ");
            t = input.nextInt();
            hasil_int = p * l * t;
            System.out.println("\nProcessing...");
            System.out.println("Volume dari balok adalah " + hasil_int);
            System.out.println(" ");
            System.out.println("-------------------------------------");
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();
        } else if (pilih_bidang == 3) {
            System.out.println("-------------------------------------");
            System.out.println("Anda Memilih Tabung");
            System.out.println("-------------------------------------");
            System.out.print("Masukan Jari-Jari Tabung : ");
            j = input.nextInt();
            System.out.print("Masukan Tinggi Tabung: ");
            t = input.nextInt();
            phi = 3.14;
            hasil_double = j * t * phi;
            System.out.println("\nProcessing...");
            System.out.println("Volume dari tabung adalah " + hasil_double);
            System.out.println("Tekan apa saja untuk kembali ke menu utama");
            try {
                System.in.read();
            }catch (Exception e){
                System.out.print("");
            }
            menu();
        } else if (pilih_bidang == 0) {
            menu();
        } else {
            System.out.print("Inputan Salah");
            PilihBidangVolume();
        }
    }
}

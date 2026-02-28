package Minggu3;
import java.util.Scanner;

public class Matakuliah09 {
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliah09() {

    }

    public Matakuliah09(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner input) {
        String dummy;
        System.out.print("Kode        : ");
        this.kode = input.nextLine();
        System.out.print("Nama        : ");
        this.nama = input.nextLine();
        System.out.print("Sks         : ");
        dummy = input.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam  : ");
        dummy = input.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
        System.out.println("-------------------");
    }

    void cetakInfo() {
        System.out.println("Kode       :" + kode);
        System.out.println("Nama       :" + nama);
        System.out.println("Sks        :" + sks);
        System.out.println("Jumlah Jam :" + jumlahJam);
        System.out.println("-------------------");
    }

}
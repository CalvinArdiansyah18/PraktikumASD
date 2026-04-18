package Minggu7;

import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {

        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09();
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------");
            list.tambah(new Mahasiswa09(nim, nama, kelas, ipk));
        }
        
        list.tampil();
        System.out.println("-----------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------");
        System.out.print("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();
        System.out.println("-----------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}

package Minggu3;

import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen09[] arrayOfDosen = new Dosen09[3];
        String nama, kode;
        int usia;
        Boolean jenisKelamin;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen: " + (i + 1));
            System.out.print("Kode: ");
            kode = input.nextLine();
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("Jenis Kelamin (Pria | Wanita): ");
            String jk = input.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia: ");
            usia = input.nextInt();
            input.nextLine();
            System.out.println("-------------------------");

            arrayOfDosen[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen09 d : arrayOfDosen) {
            System.out.println("Data dosen ke-" + no++);
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + d.usia);
            System.out.println("-------------------------");
        }

        DataDosen09 dosen = new DataDosen09();
        dosen.infoDosenPalingMuda(arrayOfDosen);

        input.close();
    }
}

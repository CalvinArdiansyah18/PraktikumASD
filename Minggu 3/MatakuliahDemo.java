import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = input.nextLine();
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.print("Sks: ");
            dummy = input.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumalah jam: ");
            dummy = input.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------");

            arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       :" + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       :" + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        :" + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam :" + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-------------------");
        }

        input.close();
    }
}

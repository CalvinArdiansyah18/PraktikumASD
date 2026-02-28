package Minggu3;
import java.util.Scanner;

public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = Integer.parseInt(input.nextLine());
        System.out.println("-------------------");
        Matakuliah09[] arrayOfMatakuliah = new Matakuliah09[jumlah];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah09();
            arrayOfMatakuliah[i].tambahData(input);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        input.close();
    }
}

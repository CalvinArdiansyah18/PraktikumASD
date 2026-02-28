import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa09[] arrayOfMahasiswa = new Mahasiswa09[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa09();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  : ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("NAMA : ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("KELAS: ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK  : ");
            dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM  :" + arrayOfMahasiswa[i].nim);
            System.out.println("NAMA : " + arrayOfMahasiswa[i].nama);
            System.out.println("KELAS:" + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK  :" + arrayOfMahasiswa[i].ipk);
            System.out.println("---------------------------------");
        }

        input.close();
    }
}
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jadwal kuliah:  ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[][] jadwal = new String[n][4];
        int menu;

        do {
            System.out.println("1. Input Data Jadwal");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Berdasarkan Hari");
            System.out.println("4. Cari Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    inputData(jadwal, sc);
                    break;
                case 2:
                    tampilkanSemua(jadwal);
                    break;
                case 3:
                    cariBerdasarkanHari(jadwal, sc);
                    break;
                case 4:
                    cariBerdasarkanNama(jadwal, sc);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 5);
    }

    public static void inputData(String[][] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            array[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            array[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            array[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            array[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] array) {
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-20s | %-10s | %-10s | %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null) {
                System.out.printf("%-20s | %-10s | %-10s | %-10s\n", array[i][0], array[i][1], array[i][2], array[i][3]);
            }
        }
    }

    public static void cariBerdasarkanHari(String[][] array, Scanner sc) {
        System.out.print("Masukkan Hari: ");
        String cari = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i][2] != null && array[i][2].equalsIgnoreCase(cari)) {
                System.out.println("Matkul: " + array[i][0] + ", Ruang: " + array[i][1] + ", Jam: " + array[i][3] + "");
            }
        }
    }

    public static void cariBerdasarkanNama(String[][] array, Scanner sc) {
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String cari = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null && array[i][0].equalsIgnoreCase(cari)) {
                System.out.println("Ruang " + array[i][1] + ", Hari " + array[i][2] + ", Jam " + array[i][3]);
            }
        }
    }
}
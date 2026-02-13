import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = input.nextInt();
        System.out.println("=======================");

        if (tugas < 0 || tugas > 100){
            System.out.println("Nilai tidak valid");
        } else if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai tidak valid");
        } else if (uts < 0 || uts > 100) {
            System.out.println("Nilai tidak valid");
        } else if (uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = tugas * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.3;
            String nilaiHuruf;
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            }else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            }else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            }else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            }else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            }else{
                nilaiHuruf = "E";
            }

            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("=======================");

            String status = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "ANDA TIDAK LULUS " : "SELAMAT ANDA LULUS");
            System.out.println(status);
        }
        input.close();
    }
}

public class MataKuliahMain09 {
    public static void main(String[] args) {

        MataKuliah09 matkul1 = new MataKuliah09();
        matkul1.kodeMK = "mtk";
        matkul1.nama = "matematika";
        matkul1.sks = 2;
        matkul1.jumlahJam = 3;
        matkul1.tampilkanInformasi();

        
        matkul1.ubahSKS(5);
        matkul1.tambahJam(1);
        matkul1.tampilkanInformasi();


        MataKuliah09 matkul2 = new MataKuliah09("prg", "program", 2, 4);
        matkul2.tampilkanInformasi();
        System.out.println();

        matkul2.ubahSKS(5);
        matkul2.tampilkanInformasi();
        System.out.println();

        matkul2.tambahJam(4);
        matkul2.tampilkanInformasi();
        System.out.println();

        matkul2.kurangJam(10);
        matkul2.tampilkanInformasi();
    }
}

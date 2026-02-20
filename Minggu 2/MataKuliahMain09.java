public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 matkul = new MataKuliah09("prg", "program", 2, 4);
        matkul.tampilkanInformasi();
        System.out.println();

        matkul.ubahSKS(5);
        matkul.tampilkanInformasi();
        System.out.println();

        matkul.tambahJam(4);
        matkul.tampilkanInformasi();
        System.out.println();

        matkul.kurangJam(10);
        matkul.tampilkanInformasi();
    }
}

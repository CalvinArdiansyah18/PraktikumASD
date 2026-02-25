public class DosenMain09 {
    public static void main(String[] args) {
        Dosen09 dosen = new Dosen09("2321", "Eko", "matematika", 2020, true);
        dosen.tampilInformasi();
        System.out.println();
        dosen.setStatusAktif(false);
        dosen.ubahKeahlian("aljabar");
        dosen.tampilInformasi();
        System.out.println("Masa kerja dosen " + dosen.hitungMasaKerja(2026) + " tahun");

    }
}

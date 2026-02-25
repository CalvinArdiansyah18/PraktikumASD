public class Dosen09 {
    String idDosen, nama, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

    public Dosen09() {

    }

    public Dosen09(String idDosen, String nama, String bidangKeahlian, int tahunBergabung, boolean statusAktif) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }

    void tampilInformasi() {
        System.out.println("idDosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status aktif: " + (statusAktif ? "AKtif" : "Tidak aktif"));
    }

    void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int thnSekarang) {
        return thnSekarang - this.tahunBergabung;
    }

    void ubahKeahlian(String ubahBidang) {
        this.bidangKeahlian = ubahBidang;
    }
}

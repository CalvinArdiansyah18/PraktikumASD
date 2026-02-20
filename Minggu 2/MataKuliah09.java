public class MataKuliah09 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilkanInformasi(){
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS sudah diubah");
    }

    void tambahJam(int jamBaru){
        jumlahJam += jamBaru;
        System.out.println("Jam berhasil ditambah");
    }

    void kurangJam(int kurangJam){
        if (jumlahJam >= kurangJam) {
            jumlahJam -= kurangJam;
            System.out.println("Jam berhasil dikurangi");
        } else {
            System.out.println("Tidak bisa dikurangi karena jumlah jam kurang");
        }
    }

    public MataKuliah09(){
        
    }

    public MataKuliah09(String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

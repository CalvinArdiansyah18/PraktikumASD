public class MahasiswaMain09 {
    public static void main(String[] args) {
        Mahasiswa09 mhs1 = new Mahasiswa09();
        mhs1.nama = "ali";
        mhs1.nim = "237617233";
        mhs1.kelas = "SIB 2A";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1C");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}

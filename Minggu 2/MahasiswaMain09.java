public class MahasiswaMain09 {
    public static void main(String[] args) {

        Mahasiswa09 mhs1 = new Mahasiswa09();

        mhs1.nama = "Calvin";
        mhs1.nim = "254107020214";
        mhs1.kelas = "TI 1C";
        mhs1.ipk = 3.55 ;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 2C");
        mhs1.updateIpk(3.60);
        System.out.println();
        mhs1.tampilkanInformasi();

    }
}
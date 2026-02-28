package Minggu3;

public class DataDosen09 {
    void dataSemuaDosen(Dosen09[] arrayOfDosen) {
        int no = 1;
        for (Dosen09 d : arrayOfDosen) {
            System.out.println("Data dosen ke-" + no++);
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + d.usia);
            System.out.println("-------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen09 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        
        System.out.println("Jumlah dosen laki laki: " + pria);
        System.out.println("Jumlah dosen perempuan: " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int totalPria = 0, jumlahPria = 0;
        int totalWanita = 0, jumlahWanita = 0;

        for (Dosen09 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata usia dosen laki-laki : " + (jumlahPria > 0 ? (totalPria / jumlahPria) : 0));
        System.out.println("Rata-rata usia dosen perempuan : " + (jumlahWanita > 0 ? (totalWanita / jumlahWanita) : 0));
    }

    void infoDosenPalingTua(Dosen09[] arrayOfDosen) {
        Dosen09 tertua = arrayOfDosen[0];

        for (Dosen09 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua");
        System.out.println("Kode: " + tertua.kode);
        System.out.println("Nama: " + tertua.nama);
        System.out.println("Jenis Kelamin: " + (tertua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + tertua.usia);
    }

    void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        Dosen09 termuda = arrayOfDosen[0];

        for (Dosen09 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda");
        System.out.println("Kode: " + termuda.kode);
        System.out.println("Nama: " + termuda.nama);
        System.out.println("Jenis Kelamin: " + (termuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + termuda.usia);

    }
}

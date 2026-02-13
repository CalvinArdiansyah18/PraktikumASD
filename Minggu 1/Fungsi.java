public class Fungsi {
    public static void main(String[] args) {

        int[][] tabel = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }

        };

        int[] harga = { 75000, 50000, 60000, 10000 };
        
        tampilkan(tabel, harga);

    }

    public static void tampilkan(int[][] stok, int[] harga) {
        System.out.println("===============================");
        System.out.println("Nama Cabang   Pendapatan Status");
        System.out.println("===============================");

        for (int i = 0; i < stok.length; i++) {
            int total = 0;
            for (int j = 0; j < stok[i].length; j++) {
                total += (stok[i][j] * harga[j]);
            };

            String status;
            if (total > 1500000) {
                status = "Sangat baik";
            } else {
                status = "Perlu eval";
            }

            System.out.println("RoyalGarden " + (i + 1) + " Rp " + total + " " + status);
        }
    }
}

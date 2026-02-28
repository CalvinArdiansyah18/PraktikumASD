public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa09[] arrayOfMahasiswa = new Mahasiswa09[3];

        arrayOfMahasiswa[0] = new Mahasiswa09();
        arrayOfMahasiswa[0].nim = "2408040561"; 
        arrayOfMahasiswa[0].nama = "AGNES"; 
        arrayOfMahasiswa[0].kelas = "SIB-1E"; 
        arrayOfMahasiswa[0].ipk = (float) 3.75; 
        
        arrayOfMahasiswa[1] = new Mahasiswa09();
        arrayOfMahasiswa[1].nim = "2408040736"; 
        arrayOfMahasiswa[1].nama = "MAULANA"; 
        arrayOfMahasiswa[1].kelas = "TI-2A"; 
        arrayOfMahasiswa[1].ipk = (float) 3.36; 
        
        arrayOfMahasiswa[2] = new Mahasiswa09();
        arrayOfMahasiswa[2].nim = "2408040281"; 
        arrayOfMahasiswa[2].nama = "PUTRANTO"; 
        arrayOfMahasiswa[2].kelas = "TI-2E"; 
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM   :" + arrayOfMahasiswa[0].nim);
        System.out.println("NAMA  :" + arrayOfMahasiswa[0].nama);
        System.out.println("KELAS :" + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK   :" + arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM   :" + arrayOfMahasiswa[1].nim);
        System.out.println("NAMA  :" + arrayOfMahasiswa[1].nama);
        System.out.println("KELAS :" + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK   :" + arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM   :" + arrayOfMahasiswa[2].nim);
        System.out.println("NAMA  :" + arrayOfMahasiswa[2].nama);
        System.out.println("KELAS :" + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK   :" + arrayOfMahasiswa[2].ipk);
    }
}
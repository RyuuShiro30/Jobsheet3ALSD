public class Mahasiswademo {
    public static void main(String[] args) {
        Mahasiswa08[] arrayofMahasiswa08 = new Mahasiswa08[3];
        arrayofMahasiswa08[0] = new Mahasiswa08();
        arrayofMahasiswa08[0].nim = "244107060033";
        arrayofMahasiswa08[0].nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa08[0].kelas = "SIB-1E";
        arrayofMahasiswa08[0].ipk = (float) 3.75;

        arrayofMahasiswa08[1] = new Mahasiswa08();
        arrayofMahasiswa08[1].nim = "2341720172";
        arrayofMahasiswa08[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa08[1].kelas = "TI-2A";
        arrayofMahasiswa08[1].ipk = (float) 3.36;

        arrayofMahasiswa08[2] = new Mahasiswa08();
        arrayofMahasiswa08[2].nim = "244107023006";
        arrayofMahasiswa08[2].nama = "DIRHAMAWAN PUTRANTO ";
        arrayofMahasiswa08[2].kelas = "TI-2E";
        arrayofMahasiswa08[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayofMahasiswa08[0].nim);
        System.out.println("Nama    : " + arrayofMahasiswa08[0].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa08[0].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa08[0].ipk);
        System.out.println("------------------------------------------");
        System.out.println("NIM     : " + arrayofMahasiswa08[1].nim);
        System.out.println("Nama    : " + arrayofMahasiswa08[1].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa08[1].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa08[1].ipk);
        System.out.println("------------------------------------------");
        System.out.println("NIM     : " + arrayofMahasiswa08[2].nim);
        System.out.println("Nama    : " + arrayofMahasiswa08[2].nama);
        System.out.println("Kelas   : " + arrayofMahasiswa08[2].kelas);
        System.out.println("IPK     : " + arrayofMahasiswa08[2].ipk);
        System.out.println("------------------------------------------");
    }
}

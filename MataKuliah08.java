public class MataKuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    public void tampilkanInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-------------------------------------------");
    }
}

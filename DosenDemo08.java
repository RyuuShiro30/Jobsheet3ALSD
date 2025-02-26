import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        Dosen08[] daftarDosen = new Dosen08[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode        : ");
            String kode = scanner.nextLine();

            System.out.print("Nama        : ");
            String nama = scanner.nextLine();

            System.out.print("Jenis Kelamin (1 = Pria, 0 = Wanita) : ");
            int jk = scanner.nextInt();
            boolean jenisKelamin = (jk == 1);

            System.out.print("Usia        : ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            daftarDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Data Dosen ===");
        int index = 0;
        for (Dosen08 dosen : daftarDosen) {
            dosen.tampilkanInfo(index);
            index++;
        }

        scanner.close();
    }
}

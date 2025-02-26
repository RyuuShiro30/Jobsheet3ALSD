import java.util.Scanner;
public class Mahasiswademo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa08[] arrayofMahasiswa08 = new Mahasiswa08[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayofMahasiswa08[i] = new Mahasiswa08();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayofMahasiswa08[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayofMahasiswa08[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa08[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayofMahasiswa08[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------------");
        }   
        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayofMahasiswa08[i].cetakInfo();
        }
    }
}

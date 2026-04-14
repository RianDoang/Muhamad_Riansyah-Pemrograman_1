// Muhamad Riansyah - 241011402323
import java.util.Scanner;

public class muhamad_riansyah_latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama, nim, kelas, alamat;
        int umur;
        
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.println();
        
        System.out.print("Masukkan Nama       : ");
        nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM        : ");
        nim = scanner.nextLine();
        
        System.out.print("Masukkan Umur       : ");
        umur = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Masukkan Kelas      : ");
        kelas = scanner.nextLine();
        
        System.out.print("Masukkan Alamat     : ");
        alamat = scanner.nextLine();
        
        System.out.println();
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("Kelas   : " + kelas);
        System.out.println("Alamat  : " + alamat);
        
        scanner.close();
    }
}

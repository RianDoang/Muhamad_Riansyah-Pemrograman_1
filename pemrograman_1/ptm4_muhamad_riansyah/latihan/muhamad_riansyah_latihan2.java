// Muhamad Riansyah - 241011402323
import java.util.Scanner;

public class muhamad_riansyah_latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama = "Rian";
        String nim = "241011402323";
        
        double kehadiran, tugas, uts, uas;
        double bobotKehadiran, bobotTugas, bobotUTS, bobotUAS, total;
        double realisasi = 21;
        
        System.out.println("Proses");
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        
        System.out.println("Input Data");
        System.out.println();
        
        System.out.print("Masukkan Kehadiran       : ");
        kehadiran = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas     : ");
        tugas = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UTS       : ");
        uts = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UAS       : ");
        uas = scanner.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Perhitungan");
        System.out.println();
        
        bobotKehadiran = (kehadiran / realisasi) * 10;
        bobotTugas = (tugas * 20) / 100;
        bobotUTS = (uts * 30) / 100;
        bobotUAS = (uas * 40) / 100;
        total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;
        
        System.out.println("Bobot Kehadiran = " + String.format("%.2f", bobotKehadiran));
        System.out.println("Bobot Tugas     = " + String.format("%.2f", bobotTugas));
        System.out.println("Bobot UTS       = " + String.format("%.2f", bobotUTS));
        System.out.println("Bobot UAS       = " + String.format("%.2f", bobotUAS));
        System.out.println("Total           = " + String.format("%.2f", total));

        
        
        System.out.println();
        
        scanner.close();
    }
}

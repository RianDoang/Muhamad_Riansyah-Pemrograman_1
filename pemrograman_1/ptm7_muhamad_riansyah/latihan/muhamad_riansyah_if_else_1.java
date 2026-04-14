import java.util.Scanner;

public class muhamad_riansyah_if_else_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai (1 atau lainnya): ");
    int nilai = input.nextInt();
    input.nextLine();
    String hewan;
    String rasa;

    if (nilai == 1) {
      System.out.print("Pilih hewan: (ayam, sapi, kambing) ");
      String hewan = input.nextLine();
      System.out.println("\nKamu memilih menu makanan " + hewan + " dengan rasa " + rasa);
    } else {
      System.out.println("\nTidak ada hewan");
      System.out.println("Tidak ada rasa");
    }

    input.close();
  }
}
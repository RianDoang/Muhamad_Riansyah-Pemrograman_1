import java.util.Scanner;

public class muhamad_riansyah_if_else_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai (1 atau lainnya): ");
    int nilai = input.nextInt();
    input.nextLine(); 

    switch (nilai) {
      case 1:
        System.out.print("Masukkan hewan: ");
        String hewan = input.nextLine();
        System.out.print("Masukkan rasa: ");
        String rasa = input.nextLine();

        System.out.println("\nKamu memilih menu makanan " + hewan + " dengan rasa " + rasa);
        break;
      default:
        System.out.println("\nTidak ada ayam");
        System.out.println("Tidak ada rasa");
        break;
    }

    input.close();
  }
}

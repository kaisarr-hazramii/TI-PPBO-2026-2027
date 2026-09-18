import java.util.Scanner;
public class MenuMakanan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("===Menu Makanan===");
        System.out.println("ayam bakar");
        System.out.println("Masak rendang");
        System.out.println("sate padang");
        System.out.println("kebab turki");

        System.out.print("pilih menu makanan(1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("anda memilih ayam bakar");
                break;
            case 2:
                System.out.println("anda memilih masak rendang");
                break;
            case 3:
                System.out.println("anda memilih sate padang");
                break;
            case 4:
                System.out.println("anda memilih kebab turki");
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}

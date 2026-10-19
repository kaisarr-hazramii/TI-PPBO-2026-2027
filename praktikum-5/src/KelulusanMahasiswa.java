import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai");
        int nilai = sc.nextInt();

        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >= 75) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }
}

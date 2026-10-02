import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println("masukkan 10 angka:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka ke-" +(i+1) + ":");
            angka[i] = sc.nextInt();

        }
        System.out.println("array dalam urutan terbalik");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.println(angka[i] + " ");
        }
    }
}

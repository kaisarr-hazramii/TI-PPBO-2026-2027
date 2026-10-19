import java.util.Scanner;

public class NamaMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai = 75;
        char huruf;
        if ( nilai >= 85) {
            huruf = 'A';
        } else if (nilai>= 70) {
            huruf = 'B';
        } else if (nilai >= 55) {
        }else {
            huruf = 'E';
        }
        System.out.println("Nilai huruf: ");

    }
}

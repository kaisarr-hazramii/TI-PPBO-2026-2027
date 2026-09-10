import java.util.Scanner;

public class ScannerSuhu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fahrenheit;

        System.out.println("masukkan suhu celcius: ");
        double celcius=sc.nextDouble();

        fahrenheit = celcius * 9/5 + 32;
        System.out.println("suhu fahrenheit = " +fahrenheit);
    }
}

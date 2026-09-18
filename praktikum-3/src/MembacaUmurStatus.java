import java.util.Scanner;
public class MembacaUmurStatus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan umur : ");
        int umur = sc.nextInt();

        System.out.println("apakah mahasiswa? (true/false : ");
        boolean mahasiwa = sc.nextBoolean();

        if (mahasiwa || umur < 25 ) {
            System.out.println("mendapat harga khusus/diskon");
        } else {
            System.out.println("harga normal");

        }
    }
}

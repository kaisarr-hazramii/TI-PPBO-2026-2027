/*Nama:kaisar hazrami
NIM:2025573010121
kelas:TI-2E
program:KalkulatorBangunDatar
 */
import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input panjang
        System.out.println("masukkan panjang:");
        //input lebar
        double panjang= sc.nextDouble();
        System.out.println("masukkan lebar:");
        double lebar= sc.nextDouble();
        //rumus menghitung luas persegi panjang
        double luaspersegipanjang=panjang*lebar;
        //rumus menghitung keliling persegi panjang
        double keliling=2*(panjang+lebar);
        //menampilkan luas persegi panjang
        System.out.println("luas persegi panjang: " +luaspersegipanjang);
        //menampilkan keliling persegi panjang
        System.out.println("keliling persegi panjang: " +keliling);
        //mengecek apakah nilai luas >100
        boolean luasbesar= luaspersegipanjang >100;

        System.out.println("luas besar: " +luasbesar);

        //input jari jari keliling
        System.out.println("masukkan jari-jari lingkaran:");
        double r= sc.nextDouble();
        //rumus menghitung luas lingkarang
        double luaslingkaran=Math.PI*r*r;
        //rumus menghitung luas kelilinglingkaran
        double kelilinglingkaran=2*Math.PI*r;

        //menampilkanluaslingkaran
        System.out.println("luas lingkaran : " + luaslingkaran);
        //menampilkan kelilinglingkaran
        System.out.println("keliling lingkaran: " + kelilinglingkaran);
    }

}

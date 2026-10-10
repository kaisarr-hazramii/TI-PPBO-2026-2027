import java.util.Scanner;

public class Latihan {
    //method latihan 1
    static double luaspersegipanjang(double p, double l) {
        return p * l;

    }

    static double luaslingkaran(double r) {
        return Math.PI * r * r;
    }

    //method latihan 2
    static boolean isprima(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    //method 3
    static double konversisuhu(double celsius) {
        return (celsius * 1.8) + 32;
    }

    static double konversisuhu(double celcius, String skalatujuan) {
        if (skalatujuan == "Kelvin") {
            return celcius + 273.15;
        } else if (skalatujuan == "farenheit") {
            return (celcius * 1.8) + 32;

        }
        return 0;

    }
    //method 4
    static int carinilaiminimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }

        }
        return min;
    }

    static int carinilaimaksimum(int[] data) {
        int maks = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maks) {
                maks = data[i];
            }
        }
        return maks;
    }
    //method latihan 5
    static int hitungtotal(int[] data) {
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }

    static int[] filterdiatasratarata(int[] data) {
        double rataRata = (double) hitungtotal(data) / data.length;
        int jumlah = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > rataRata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];

        int index = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > rataRata) {
                hasil[index] = data[i];
                index++;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---latihan 1----");
        System.out.println("luas persegipanjang: " + luaspersegipanjang(6.0, 7.0));
        System.out.println("luas lingkaran: " + luaslingkaran(7));
        System.out.println();

        System.out.println("----latihan 2----");
        System.out.println("bilangan prima dari 1 sampai 50:");

        for (int i = 1; i <= 50; i++) {
            if (isprima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\n----latihan 3----");
        System.out.println("\nnilai dalam farenheit:" + konversisuhu(10));
        System.out.println();

        System.out.println("nilai kelvin:" + konversisuhu(10, "Kelvin"));
        System.out.println();

        System.out.println("----latihan4----");
        System.out.print("masukan jumlah nilai:");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("masukkan nilai ke-" + (i + 1) + ":");
            nilai[i] = sc.nextInt();
            System.out.println();

        }
        System.out.println("nilai maksimum adalah: " + carinilaimaksimum(nilai));
        System.out.println("nilai minimum adalah:" + carinilaiminimum(nilai));
        System.out.println();
        System.out.println("----latihan 5----");
        System.out.println("Total Nilai = " + hitungtotal(nilai));


        double rataRata = (double) hitungtotal(nilai) / nilai.length;

        System.out.println("Rata-rata = " + rataRata);


        int[] hasil = filterdiatasratarata(nilai);

        System.out.print("Nilai di atas rata-rata = ");

        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");

        }
    }
}

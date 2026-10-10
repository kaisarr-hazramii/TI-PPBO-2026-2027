import java.util.Scanner;
import java.util.ArrayList;

public class KalkulatorMethod {

    // Method penjumlahan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method mencari nilai maksimum riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> riwayat = new ArrayList<>();

        int pilihan;
        double a, b, c, hasil;

        do {
            System.out.println("\n=== KALKULATOR METHOD ===");
            System.out.println("1. Tambah 2 Angka");
            System.out.println("2. Tambah 3 Angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            if (pilihan == 0) {
                break;
            }

            if (pilihan < 1 || pilihan > 7) {
                System.out.println("Pilihan tidak tersedia!");
                continue;
            }

            System.out.print("Masukkan angka pertama: ");
            a = input.nextDouble();

            b = 0;
            c = 0;

            if (pilihan != 7) {
                System.out.print("Masukkan angka kedua: ");
                b = input.nextDouble();
            }

            if (pilihan == 2) {
                System.out.print("Masukkan angka ketiga: ");
                c = input.nextDouble();
            }

            switch (pilihan) {
                case 1:
                    hasil = tambah(a, b);
                    break;

                case 2:
                    hasil = tambah(a, b, c);
                    break;

                case 3:
                    hasil = kurang(a, b);
                    break;

                case 4:
                    hasil = kali(a, b);
                    break;

                case 5:
                    if (b == 0) {
                        System.out.println("Tidak bisa dibagi nol!");
                        continue;
                    }
                    hasil = bagi(a, b);
                    break;

                case 6:
                    hasil = pangkat(a, b);
                    break;

                case 7:
                    if (a < 0) {
                        System.out.println("Tidak bisa akar negatif!");
                        continue;
                    }
                    hasil = akarKuadrat(a);
                    break;

                default:
                    continue;
            }

            System.out.println("Hasil = " + hasil);

            // Menyimpan hasil ke riwayat
            riwayat.add(hasil);

        } while (pilihan != 0);

        // Menampilkan nilai maksimum saat keluar
        if (riwayat.size() > 0) {

            double[] riwayatHasil = new double[riwayat.size()];

            for (int i = 0; i < riwayat.size(); i++) {
                riwayatHasil[i] = riwayat.get(i);
            }

            System.out.println("\n=== RIWAYAT HASIL ===");

            for (double nilai : riwayatHasil) {
                System.out.println(nilai);
            }

            System.out.println("Nilai maksimum = "
                    + riwayatKeMaksimum(riwayatHasil));

        } else {
            System.out.println("Belum ada perhitungan.");
        }

        System.out.println("Program selesai.");
        input.close();
    }
}
import java.util.Scanner;

public class PengolahNilaiKelas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menentukan nilai KKM untuk menentukan mahasiswa lulus atau tidak
        int KKM = 70;


        // Input jumlah mahasiswa dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();


        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[N];


        // Memasukkan nilai setiap mahasiswa ke dalam array menggunakan perulangan for
        for (int i = 0; i < N; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

        }


        // Menampilkan nilai sebelum dilakukan proses pengurutan
        System.out.println("\nNilai sebelum diurutkan:");

        for (int i = 0; i < N; i++) {

            System.out.print(nilai[i] + " ");

        }


        // Menghitung jumlah seluruh nilai mahasiswa
        int total = 0;

        for (int i = 0; i < N; i++) {

            total = total + nilai[i];

        }


        // Menghitung nilai rata-rata kelas
        double rata = (double) total / N;



        // Menentukan nilai tertinggi dan nilai terendah
        // Nilai pertama digunakan sebagai nilai awal pembanding
        int tertinggi = nilai[0];
        int terendah = nilai[0];


        for (int i = 1; i < N; i++) {


            // Mengecek apakah ada nilai yang lebih tinggi
            if (nilai[i] > tertinggi) {

                tertinggi = nilai[i];

            }


            // Mengecek apakah ada nilai yang lebih rendah
            if (nilai[i] < terendah) {

                terendah = nilai[i];

            }

        }



        // Menghitung jumlah mahasiswa yang lulus dan tidak lulus
        int lulus = 0;
        int tidakLulus = 0;


        for (int i = 0; i < N; i++) {


            // Jika nilai lebih besar atau sama dengan KKM maka mahasiswa lulus
            if (nilai[i] >= KKM) {

                lulus++;

            }
            // Jika nilai kurang dari KKM maka mahasiswa tidak lulus
            else {

                tidakLulus++;

            }

        }



        // Proses pengurutan nilai menggunakan algoritma Bubble Sort
        // Urutan nilai dari yang terkecil sampai terbesar (ascending)
        for (int i = 0; i < N - 1; i++) {


            for (int j = 0; j < N - i - 1; j++) {


                // Membandingkan dua nilai yang bersebelahan
                if (nilai[j] > nilai[j + 1]) {


                    // Menukar posisi nilai jika urutan belum benar
                    int sementara = nilai[j];

                    nilai[j] = nilai[j + 1];

                    nilai[j + 1] = sementara;

                }

            }

        }



        // Menampilkan nilai setelah dilakukan pengurutan
        System.out.println("\n\nNilai setelah diurutkan:");

        for (int i = 0; i < N; i++) {

            System.out.print(nilai[i] + " ");

        }



        // Menampilkan laporan hasil pengolahan nilai mahasiswa
        System.out.println("\n\n===== LAPORAN NILAI KELAS =====");

        System.out.println("Jumlah mahasiswa     : " + N);

        System.out.println("Nilai KKM            : " + KKM);

        System.out.println("Nilai rata-rata      : " + rata);

        System.out.println("Nilai tertinggi      : " + tertinggi);

        System.out.println("Nilai terendah       : " + terendah);

        System.out.println("Jumlah mahasiswa lulus       : " + lulus);

        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);



        // Menutup Scanner
        input.close();

    }
}
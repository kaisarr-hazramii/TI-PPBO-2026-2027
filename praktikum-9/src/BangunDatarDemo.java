public class BangunDatarDemo {
    public static void main(String[] args) {
        // Array bertipe superclass berisi campuran 3 subclass (7 object)
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7),
                new Persegi("Persegi A", 5),
                new PersegiPanjang("Persegi Panjang A", 8, 4),
                new Lingkaran("Lingkaran B", 3.5),
                new Persegi("Persegi B", 10),
                new PersegiPanjang("Persegi Panjang B", 12, 6),
                new Lingkaran("Lingkaran C", 2)
        };

        // Tampilkan info setiap bangun dalam satu perulangan
        System.out.println("=== INFORMASI SELURUH BANGUN DATAR ===");
        for (BangunDatar b : daftarBangun) {
            b.tampilkanInfo(); // dynamic binding
        }

        // Hitung total luas & cari luas terbesar
        double totalLuas = 0;
        BangunDatar terbesar = daftarBangun[0];

        for (BangunDatar b : daftarBangun) {
            double luas = b.hitungLuas();
            totalLuas += luas;

            if (luas > terbesar.hitungLuas()) {
                terbesar = b;
            }
        }

        System.out.printf("TOTAL LUAS seluruh bangun : %.2f%n", totalLuas);
        System.out.printf("Bangun dengan LUAS TERBESAR: %s (%.2f)%n",
                terbesar.namaBangun, terbesar.hitungLuas());
    }
}
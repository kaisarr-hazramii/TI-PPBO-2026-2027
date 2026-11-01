
public class RekeningBank {

    // Atribut private
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private final String jenisRekening;

    // Constructor
    public RekeningBank(String nomorRekening, String pemilik,
                        String jenisRekening, double saldoAwal) {

        // Validasi saldo awal
        if (saldoAwal < 0 || !Double.isFinite(saldoAwal)) {
            throw new IllegalArgumentException(
                    "Saldo awal tidak boleh negatif atau tidak valid."
            );
        }

        // Validasi jenis rekening
        if (jenisRekening == null || jenisRekening.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Jenis rekening harus diisi."
            );
        }

        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = saldoAwal;
    }

    // Getter nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Getter pemilik
    public String getPemilik() {
        return pemilik;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter jenis rekening (read-only)
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method setor uang
    public void setor(double jumlah) {
        if (jumlah <= 0 || !Double.isFinite(jumlah)) {
            System.out.println(
                    "Setor gagal: jumlah setoran harus positif dan valid."
            );
            return;
        }

        saldo += jumlah;
        System.out.printf(
                "Setor berhasil ke %s: Rp%,.2f%n",
                nomorRekening, jumlah
        );
    }

    // Method tarik uang
    public void tarik(double jumlah) {
        if (jumlah <= 0 || !Double.isFinite(jumlah)) {
            System.out.println(
                    "Tarik gagal: jumlah penarikan harus positif dan valid."
            );
        } else if (saldo < jumlah) {
            System.out.println(
                    "Tarik gagal: saldo tidak mencukupi."
            );
        } else {
            saldo -= jumlah;
            System.out.printf(
                    "Tarik berhasil dari %s: Rp%,.2f%n",
                    nomorRekening, jumlah
            );
        }
    }

    // Method transfer antar rekening
    public void transferKe(RekeningBank tujuan, double jumlah) {

        // Memastikan rekening tujuan tersedia
        if (tujuan == null) {
            System.out.println(
                    "Transfer gagal: rekening tujuan tidak tersedia."
            );
        } else if (tujuan == this) {
            System.out.println(
                    "Transfer gagal: rekening tujuan sama dengan pengirim."
            );
        } else if (jumlah <= 0 || !Double.isFinite(jumlah)) {
            System.out.println(
                    "Transfer gagal: jumlah transfer harus positif dan valid."
            );
        } else if (saldo < jumlah) {
            System.out.println(
                    "Transfer gagal: saldo pengirim tidak mencukupi."
            );
        } else {

            // Mengurangi saldo pengirim
            this.saldo -= jumlah;

            // Menambah saldo rekening tujuan
            tujuan.saldo += jumlah;

            // Menampilkan pesan transfer berhasil
            System.out.printf(
                    "Transfer berhasil: Rp%,.2f dari %s ke %s.%n",
                    jumlah, nomorRekening, tujuan.nomorRekening
            );
        }
    }

    // Method mencetak mutasi rekening
    public void cetakMutasi() {
        System.out.println("========================================");
        System.out.println("             MUTASI REKENING            ");
        System.out.println("========================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.printf("Saldo Saat Ini : Rp%,.2f%n", saldo);
        System.out.println("========================================");
    }
}

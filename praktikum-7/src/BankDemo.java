
public class BankDemo {
    public static void main(String[] args) {

        // 1. Membuat dua objek rekening bank
        RekeningBank rekening1 = new RekeningBank(
                "1001", "Andi", "Tabungan", 500000
        );

        RekeningBank rekening2 = new RekeningBank(
                "1002", "Budi", "Giro", 200000
        );

        // 2. Setor dan tarik pada rekening pertama
        System.out.println("=== TRANSAKSI REKENING 1 ===");
        rekening1.setor(200000);
        rekening1.tarik(50000);

        // 3. Setor dan tarik pada rekening kedua
        System.out.println("\n=== TRANSAKSI REKENING 2 ===");
        rekening2.setor(100000);
        rekening2.tarik(25000);

        // 4. Transfer berhasil antar rekening
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rekening1.transferKe(rekening2, 150000);

        // 5. Transfer gagal karena saldo tidak cukup
        System.out.println("\n=== TRANSFER GAGAL ===");
        rekening2.transferKe(rekening1, 600000);

        // 6. Mencetak mutasi akhir kedua rekening
        System.out.println("\n=== MUTASI AKHIR KEDUA REKENING ===");
        rekening1.cetakMutasi();
        rekening2.cetakMutasi();
    }
}

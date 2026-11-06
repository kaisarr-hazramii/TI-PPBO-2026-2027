public class PerusahaanDemo {
    public static void main(String[] args) {
        // Object Manager (Pegawai -> Manager)
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        System.out.println("=== Data Manager ===");
        mgr.tampilkanData(); // method warisan dari Pegawai
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        System.out.println();

        // Object Staff (Pegawai -> Staff)
        Staff stf = new Staff("Sari", "S001", 5000000, 1000000);
        System.out.println("=== Data Staff ===");
        stf.tampilkanData(); // method warisan dari Pegawai
        System.out.println("Tunjangan Kinerja: " + stf.getTunjanganKinerja());

        System.out.println();

        // Object Direktur (Pegawai -> Manager -> Direktur)
        Direktur dir = new Direktur("Andi", "D001", 15000000, 5000000, 3000000);
        System.out.println("=== Data Direktur ===");
        dir.tampilkanData(); // method warisan dari Pegawai melalui Manager
        System.out.println("Tunjangan Jabatan: " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham  : " + dir.getTunjanganSaham());

        System.out.println();

        // Tambahan (opsional): pembuktian validasi gaji negatif untuk screenshot
        System.out.println("=== Uji Validasi Gaji Negatif ===");
        Staff uji = new Staff("Rina", "S002", -3000000, 500000);
        uji.tampilkanData();
    }
}
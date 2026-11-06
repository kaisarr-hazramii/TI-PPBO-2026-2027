public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merek: " + merek);
        System.out.println("kecepatan Maksimal: " + kecepatanMaks + "km/jam");
        System.out.println("Jumlah Pintu " + jumlahPintu);
    }

}
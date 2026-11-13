public class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // Versi default, akan di-override oleh subclass
    public double hitungLuas() {
        return 0;
    }

    // Versi default, akan di-override oleh subclass
    public double hitungKeliling() {
        return 0;
    }

    // TIDAK di-override: memanggil hitungLuas() & hitungKeliling() secara polimorfik
    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.printf("Luas        : %.2f%n", hitungLuas());
        System.out.printf("Keliling    : %.2f%n", hitungKeliling());
        System.out.println("-----------------------------");
    }
}
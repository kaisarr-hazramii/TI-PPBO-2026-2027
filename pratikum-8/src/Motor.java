public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI MOTOR ===");
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks + " km/jam");
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}

public class AkunPremium extends Akun {
    private double batasKredit;

    // Constructor
    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    // Method untuk mengecek limit
    public void cekLimit() {
        System.out.println("=== INFORMASI AKUN PREMIUM ===");

        System.out.println("Username: " + username);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("Batas Kredit: Rp" + batasKredit);

        double totalLimit = saldo + batasKredit;

        System.out.println("Total Limit: Rp" + totalLimit);
    }
}

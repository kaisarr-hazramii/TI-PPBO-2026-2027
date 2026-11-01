public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;

    public RekeningBank(String nomor, String pemilik, double SaldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (SaldoAwal >= 0) ? SaldoAwal : 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setor(double jumlah){
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mengcukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

}


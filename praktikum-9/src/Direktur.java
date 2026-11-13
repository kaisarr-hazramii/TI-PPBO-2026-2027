public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan); // panggil constructor Manager
        this.tunjanganSaham = tunjanganSaham;
    }

    // Getter karena tunjanganSaham bersifat private
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }
}

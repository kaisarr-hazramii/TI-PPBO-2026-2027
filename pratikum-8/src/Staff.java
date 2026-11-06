public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok,
                 double tunjanganKinerja) {
        super(nama, nip, gajiPokok); // panggil constructor Pegawai
        this.tunjanganKinerja = tunjanganKinerja;
    }

    // Getter karena tunjanganKinerja bersifat private
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }
}
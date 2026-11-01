public class produk {
    private String kodeproduk;
    private String namaProduk;
    private double harga;
    private int stok;

    //constructor dengan parameter
    public produk(String kodeproduk, String namaProduk, double harga, int stok){
        this.kodeproduk =kodeproduk;
        this.namaProduk =namaProduk;
        this.harga =harga;
        this.stok =stok;

    }

    public String getKodeproduk() {
        return kodeproduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setKodeproduk(String kodeproduk) {
        this.kodeproduk = kodeproduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        if (harga>=0){
            this.harga=harga;

        }else{
            System.out.println("di tolak,tidak boleh negatif");
        }
    }

    //method tambah stok
    public void tambahStok(int jumlah) {
        if (stok>=0){
            stok+=jumlah;


        }else{
            System.out.println("di tolak,tidak boleh negatif");
        }
    }
    //method kurangistok
    public void kurangistok(int jumlah){
        if (jumlah>0&&stok>=jumlah){
            stok -=jumlah;
        }else{
            System.out.println("ditolak,stok tidak cukup");
        }
    }
}



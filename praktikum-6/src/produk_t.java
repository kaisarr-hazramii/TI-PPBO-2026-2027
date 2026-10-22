public class produk_t {
    String kodeproduk;
    String namaProduk;
    double harga;
    int stok;

    //constructor dengan parameter
    public produk_t(String kodeproduk,String namaProduk,double harga,int stok){
        this.kodeproduk =kodeproduk;
        this.namaProduk =namaProduk;
        this.harga =harga;
        this.stok =stok;

    }

    //instance method total harga
    public double totalharga(int jumlahbeli){
        return harga * jumlahbeli;
    }
    //instance method kurangi stok
    public void kurangistok (int jumlah){
        if (jumlah >0 && stok>=jumlah){
            stok = stok -jumlah;
            System.out.println("pembelian berhasil");
        }else{
            System.out.println("stok tidak mencukupi");
        }
    }
    //instance method tampilkan data
    public void tampilkandata(){
        System.out.println("Kode produk: "+kodeproduk);
        System.out.println("nama produk: " +namaProduk);
        System.out.println("harga produk : "+harga);
        System.out.println("stok: "+stok);
        System.out.println("-----------");
    }

}
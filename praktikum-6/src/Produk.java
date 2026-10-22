public class Produk {
    String namaproduk;
    double harga;

    public Produk(String namaproduk,double harga){
        this.namaproduk=namaproduk;
        this.harga=harga;

    }


    public void tampilkandata(){
        System.out.println("nama produk:"+namaproduk);
        System.out.println("harga:"+harga);
    }
    public boolean ismahal(double batasharga){
        return harga >=batasharga;

    }
}
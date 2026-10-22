public class cekproduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("buku", 100000);
        p1.tampilkandata();
        System.out.println("mahal?"+p1.ismahal(500000));
    }
}
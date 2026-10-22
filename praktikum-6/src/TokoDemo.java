public class TokoDemo {
    public static void main(String[] args){
        //array berisi lima produk
        produk_t[] daftar = new produk_t[5];
        daftar[0] =new produk_t("k001","piston",600000,50);
        daftar[1] =new produk_t("b001","kampas kopling",150000,30);
        daftar[2] =new produk_t("f001","minyak rem",85000,65);
        daftar[3] =new produk_t("h001","olsam MOTUL",200000,90);
        daftar[4] =new produk_t("m001","stang seher",2700000,40);

        for (produk_t p :daftar){
            p.tampilkandata();
        }

        //skenario mencukupi
        System.out.println("pembelian pertama: ");
        System.out.println("produk :"+daftar[0].namaProduk);
        System.out.println("jumlah beli : 3");
        System.out.println("total harga: "+daftar[0].totalharga(3));
        daftar[0].kurangistok(3);
        System.out.println("-----------------");
        //skenario tidak mencukupi
        System.out.println("pembelian kedua: ");
        System.out.println("produk :"+daftar[2].namaProduk);
        System.out.println("jumlah beli : 10");
        System.out.println("total harga: "+daftar[2].totalharga(10));
        daftar[0].kurangistok(10);
        System.out.println("-----------------");


        produk_t termahal = daftar[0];
        for (produk_t p :daftar){
            if (p.harga > termahal.harga){
                termahal =p;

            }

        }
        System.out.println("produk termahal adalah:");
        termahal.tampilkandata();
    }



}
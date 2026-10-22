public class latihan4array {
    public static void main (String[] args){
        Buku[] daftar= new Buku[4];

        daftar[0] = new Buku("SPLTV","revan",2025);
        daftar[1] = new Buku("python","haiqal",2015);
        daftar[2] = new Buku("matriks","kaisar",2017);
        daftar[3] = new Buku("vektor","farel",2020);

        for(Buku B :daftar){
            if (B.tahunterbit >= 2015){
                B.tampilkandata();
                System.out.println("---");
            }

        }
    }
}
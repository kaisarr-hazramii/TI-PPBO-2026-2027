
public class latihan1class {
    public static void main(String[] args){
        Buku b1 =new Buku("matriks","revan",2025);

        System.out.println("---");
        Buku b2 =new Buku("SPLTV","haiqal",2015);

        System.out.println("judul:"+b1.judul);
        System.out.println("pengarang:"+b1.pengarang);
        System.out.println("tahun terbit:"+b1.tahunterbit);
        System.out.println("---");
        System.out.println("judul:"+b2.judul);
        System.out.println("pengarang:"+b2.pengarang);
        System.out.println("tahun terbit:"+b2.tahunterbit);
    }
}
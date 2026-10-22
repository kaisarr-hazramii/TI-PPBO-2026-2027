public class Buku {
    String judul;
    String pengarang;
    int tahunterbit;


    //constructor dengan parameter
    public Buku(String judul,String pengarang,int tahunterbit){
        this.judul=judul;
        this.pengarang=pengarang;
        this.tahunterbit=tahunterbit;

    }
    public void tampilkandata(){
        System.out.println("JUDUL:"+judul);
        System.out.println("pengaramg:"+pengarang);
        System.out.println("tahun terbit:"+tahunterbit);
    }



}
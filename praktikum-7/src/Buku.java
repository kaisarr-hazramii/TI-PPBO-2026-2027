public class Buku {
    private String judul;
    private String pengarang;
    private int tahunterbit;


    //constructor dengan parameter
    public Buku(String judul,String pengarang,int tahunterbit){
        this.judul=judul;
        this.pengarang=pengarang;
        this.tahunterbit=tahunterbit;

    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }
    public void setjudul(String judul){
        this.judul=judul;
    }

    public void setpengarang(String pengarang){
        this.pengarang=pengarang;
    }
}

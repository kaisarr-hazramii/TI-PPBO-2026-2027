public class Persegi {
    int sisi;


    public Persegi(int sisi){
        this.sisi=sisi;

    }

    public double hitungluas(){
        return   sisi*sisi;
    }

    public double hitungkeliling(){
        return 4*sisi;
    }

    public void tampilkandata(){
        System.out.println("persegi dengan luas terbesar adalah");
        System.out.println("sisi: "+sisi);
        System.out.println("luas: "+hitungluas());
    }

}
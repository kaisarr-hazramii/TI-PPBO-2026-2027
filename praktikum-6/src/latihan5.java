public class latihan5 {
    public static void main (String[] args){

        Persegi[] daftar =new Persegi[4];
        daftar[0] = new Persegi(7);
        daftar[1] = new Persegi(5);
        daftar[2] = new Persegi(6);
        daftar[3] = new Persegi(3);

        Persegi terbesar =daftar[0];

        for (Persegi p :daftar){
            if(p.hitungluas()>terbesar.hitungluas()){
                terbesar =p;

            }



        }
        terbesar.tampilkandata();
    }
}
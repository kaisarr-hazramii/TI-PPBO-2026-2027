public class HitungLuasDemo {
    public static void main(String[] args){
        BangunDatar[] daftarbangundatar={
                new Persegi("persegi",7),
                new Lingkaran("lingkaran",8),
        };

        double totalluas =0;
        for (BangunDatar bd :daftarbangundatar){
            double luas = bd.hitungLuas();
            System.out.println("luas "+bd.namaBangun+":"+ luas);
            totalluas+=luas;
        }
        System.out.println("total:"+totalluas);
    }
}
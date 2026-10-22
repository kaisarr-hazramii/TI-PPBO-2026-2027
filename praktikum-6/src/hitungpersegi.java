public class hitungpersegi {
    public static void main(String[] args){
        Persegi p1 =new Persegi(7);
        Persegi p2 = new Persegi(8);
        Persegi p3= new Persegi(9);

        System.out.println("persegi 1");
        System.out.println("luas persegi: "+p1.hitungluas());
        System.out.println("keliling persegi: "+p1.hitungkeliling());
        System.out.println("---");

        System.out.println("persegi 2");
        System.out.println("luas persegi: "+p2.hitungluas());
        System.out.println("keliling persegi: "+p2.hitungkeliling());
        System.out.println("---");

        System.out.println("persegi 3");
        System.out.println("luas persegi: "+p3.hitungluas());
        System.out.println("keliling persegi: "+p3.hitungkeliling());
        System.out.println("---");







    }
}
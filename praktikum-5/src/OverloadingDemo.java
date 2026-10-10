public class OverloadingDemo {
    static double tambah(double a, double b) {
        return a + b;
    }

    static int tambah(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {

        System.out.println(tambah(2.5, 3.5));
    }
}

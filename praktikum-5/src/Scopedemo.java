public class Scopedemo {
    static void methodA() {
        int x = 10; // x milik methodA
        System.out.println("Di methodA, x = " + x);
    }

    static void methodB() {
        int x = 99; // x milik methodB, berbeda dari methodA
        System.out.println("Di methodB, x = " + x);
     }

     public static void main(String[] args) {
        methodA();
        methodB();
     }
}

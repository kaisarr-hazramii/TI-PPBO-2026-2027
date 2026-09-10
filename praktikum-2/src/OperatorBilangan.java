import java.util.Scanner;

public class OperatorBilangan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bilangan 1: ");
        int a= sc.nextInt();
        System.out.println("bilangan 2: ");
        int b= sc.nextInt();

        System.out.println("jumlah(+): " +(a+b));
        System.out.println("selisih(-): " +(a-b));
        System.out.println("kali(*): " +(a*b));
        System.out.println("bagi(/): " +(a/b));
        System.out.println("hasil bagi:"+(a%b));

        System.out.println("bilangan 1 > bilangan 2 : " +(a>b));
        System.out.println("bilangan 1 < bilangan 2 : " +(a<b));
        System.out.println("bilangan 1 = bilangan 2 : " +(a==b));

    }

}


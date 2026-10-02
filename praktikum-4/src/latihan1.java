import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan bilangan: ");
        int bilangan = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println("x" +i +"=" +(bilangan*i));

        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı(n) giriniz:");
        int n= scan.nextInt();
        double son=0.0;

        for(double i=1;i<=n;i++)
        {
            son +=(1/i);
        }
        System.out.println("Harmonik sonucu:"+son);
    }
}
import java.util.Scanner;
public class FiyatHesabi {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double armut=2.14, elma=3.67,muz=0.95,dom=1.11,pat=5.00,toplam;
        int a,e,m,d,p;
        System.out.println("Kaç kilo armut:");
        a = input.nextInt();
        System.out.println("Kaç kilo elma:");
        e = input.nextInt();
        System.out.println("Kaç kilo muz:");
        m = input.nextInt();
        System.out.println("Kaç kilo domates:");
        d = input.nextInt();
        System.out.println("Kaç kilo patlıcan:");
        p = input.nextInt();
        toplam = a*armut + e *elma + m*muz + d* dom + p*pat;
        System.out.println("Toplam odenecek:" +toplam);


    }
}
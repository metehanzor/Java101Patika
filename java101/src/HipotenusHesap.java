import java.util.Scanner;
public class HipotenusHesap {

    public static void main(String[] args) {
        /*
        Java ile kullanicidan dik kenarlarin uzunlugunu alan
        ve Hipotenusu hesaplayan program.

         */

        // Degiskenleri olusturalim.

        int a,b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenari giriniz : ");
        a = scanner.nextInt();

        System.out.print("İkinci kenari giriniz :");
        b = scanner.nextInt();


        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenus uzunlugu : "+c);
















    }


}

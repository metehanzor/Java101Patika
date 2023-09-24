import java.util.Scanner;
public class TaksimetreHesap {

    public static void main(String[] args) {

        /* Java ile gidilen mesafeye (KM) göre taksimetre tutarini
        ekrana yazdiran programi yaziniz.

        -> Taksimetre KM başına 2.20 tl tutmaktadir.
        -> Minimum ödenecek tutar 20 tl dir. 20 Tl altındaki
        ücretlerde yine 20 Tl alinacaktir.
        -> Taksimetre acilis ucreti 10 Tl dir.

         */

       double mesafe,tutar;
       int acilisUcret = 10;
       int minUcret =20;
       double total;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Lüutfen gidilecek mesafeyi KM cinsinden giriniz: ");

       mesafe = scanner.nextDouble();

       tutar = (mesafe*2.20)+acilisUcret;

       tutar = tutar<minUcret ? minUcret : +tutar;

        System.out.println("Odenecek tutar : "+tutar);








    }
}

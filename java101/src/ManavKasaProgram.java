import java.util.Scanner;

public class ManavKasaProgram {

    /*
    Jave ile kullanicilarin manavdan almis oldukari urunlerin
    kilogram degerlerine gore toplam tutarini ekrana yazdiran
    programi yaziniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        double tutar =0,kilo=0;

        System.out.print("Kaç kilo  Armut :");
        kilo = scanner.nextDouble();
        tutar+=armut*kilo;

        System.out.print("Kaç kilo  Elma :");
        kilo = scanner.nextDouble();
        tutar+=elma*kilo;

        System.out.print("Kaç kilo  Domates :");
        kilo = scanner.nextDouble();
        tutar+=domates*kilo;

        System.out.print("Kaç kilo  Muz :");
        kilo = scanner.nextDouble();
        tutar+=muz*kilo;

        System.out.print("Kaç kilo  Patlican :");
        kilo = scanner.nextDouble();
        tutar+=patlican*kilo;

        System.out.println("Toplam tutar :"+tutar);















    }



}

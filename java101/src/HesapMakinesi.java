
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        /*
        Kullanicadan alinan 2 degere gore
        1==> TOPLAMA
        2==> CIKARMA
        3==> CARPMA
        4==> BOLME
        olmak uzere basit bir hesap makinesi programi yaziniz. (Switch-case yapisi ile)
         */

        double sayi1,sayi2;
        int islem;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen isleme girmesi icin iki deger giriniz:");

        sayi1= scanner.nextDouble();
        sayi2 = scanner.nextDouble();

        System.out.print("Yapilacak islemi seciniz : \n1==>Toplama\n2==>Cikarma\n3==>Carpma\n4==>Bolme");
        islem = scanner.nextInt();

        switch (islem){

            case 1:
                System.out.println("Toplam:"+(sayi1+sayi2));
                break;

            case 2:
                System.out.println("Cikarma:"+(sayi1-sayi2));
                break;

            case 3:
                System.out.println("Carpma:"+(sayi1*sayi2));
                break;

            case 4:
                System.out.println("Bolme:"+(sayi1/sayi2));
                break;

            default:
                System.out.println("Lutfen dogru deger giriniz!");

        }

    }
}

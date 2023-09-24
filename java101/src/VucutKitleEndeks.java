import java.util.Scanner;
public class VucutKitleEndeks {
    /*
    Java ile kullanicidan boy ve kilo degerleri lıp bir degiskene atayin.
    Formul = Kilo(kg)/Boy(cm)*Boy(cm)
     */

    public static void main(String[] args) {

        double kilo,boy,indeks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz:");
        boy = scanner.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz:");
        kilo = scanner.nextDouble();


        indeks = (kilo)/(boy*boy);
        System.out.println("Vucut kitle endeksiniz :"+indeks);













    }




}

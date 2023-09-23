import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        // Kullanicidan ainan para değerinin KDV'li
        // fiyatini ve KDV tutarini hesaplayip ekrana
        // bastiran programi yazin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen para miktarini giriniz :");

        double miktar = scanner.nextDouble();
        double kdvli = miktar + (miktar*0.18);
        double kdvtutari = miktar*0.18;

        System.out.println("KDV'siz fiyat:" +miktar);
        System.out.println("KDV'li fiyat: "+kdvli);
        System.out.println("KDV tutari: "+kdvtutari);







    }
}

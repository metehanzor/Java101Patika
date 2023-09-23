import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float fizik,kimya,turkce,tarih,muzik,matematik,ort;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = scanner.nextFloat();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = scanner.nextFloat();

        System.out.println("Turkce notunuzu giriniz : ");
        turkce = scanner.nextFloat();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = scanner.nextFloat();

        System.out.println("Muzik notunuzu giriniz : ");
        muzik = scanner.nextFloat();

        System.out.println("Matematik notunuzu giriniz : ");
        matematik = scanner.nextFloat();

        ort = (fizik+kimya+tarih+turkce+matematik+muzik)/6;

        System.out.println("Ortamalamaniz : "+ort);
        String str = ort>60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(str);








    }


}

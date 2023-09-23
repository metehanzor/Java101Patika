import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        float fizik,kimya,turkce,tarih,muzik,matematik,ort; // Degiskenleri olusturdum

        Scanner scanner = new Scanner(System.in); // Kullanıcıdan deger almak için Scanner sınıfı kullanıldı.

        System.out.println("Fizik notunuzu giriniz : "); // Kullanıcıdan deger isteniyor.
        fizik = scanner.nextFloat(); // alınan deger degiskene atanıyor.

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

        ort = (fizik+kimya+tarih+turkce+matematik+muzik)/6; // Ortalama hesaplanıyor.

        System.out.println("Ortamalamaniz : "+ort); // Ortalama yazdırılıyor.

        String str = ort>60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println(str);






    }
}

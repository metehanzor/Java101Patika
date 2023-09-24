
import java.util.Scanner;
public class KullaniciAdiSifre {
    public static void main(String[] args) {
        /*
        Javada koşullu ifadeler ile kullanici adı ve şifreyi kontrol eden program
         */
        Scanner scanner = new Scanner(System.in);
        String username ="admin";
        long password = 12345678;
        char chr;

        String kullaniciAdi;
        long sifre;

        System.out.print("Kullanici adinizi giriniz:");
        kullaniciAdi = scanner.nextLine();



        if(kullaniciAdi.equals(username))
        {
            System.out.print("Sifrenizi giriniz: ");
            sifre = scanner.nextLong();
            if(sifre==password)
            {
                System.out.println("Giris basarili");
            }else {
                System.out.println("Girilen sifre yanlis, sifrenizi sifirlamak ister misiniz?\n Y==>yes N==>no");
                chr = scanner.next().charAt(0);

                if(chr=='Y' || chr=='y')
                {
                    long newpass;
                    System.out.println("Lutfen yeni sifrenizi giriniz:");
                    newpass = scanner.nextLong();

                    if(newpass==sifre || newpass==password)
                    {
                        System.out.println("Yeni girdiginiz sifre hatalidir\nSifre olusturulamadi.");
                        System.out.println("Lutfen baska sifre giriniz.");
                    }else {
                        System.out.println("Yeni sifre basarili bir sekilde olusturuldu");
                    }

                }


            }

        } else {
            System.out.println("Kullanici adini yanlis girdiniz! Tekrar deneyiz");
        }


    }
}

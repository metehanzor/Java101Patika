
import java.util.Scanner;
public class HavaEtkinlik {
    public static void main(String[] args) {

        /*
        Hava sicakligina gore kullaniciya etkinlik oneren program.
        --> Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        --> Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        --> Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        --> Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        double heat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sicaklik degerini giriniz:");
        heat = scanner.nextDouble();

        if(heat<5)
        {
            System.out.println("Kayak yapabilirsiniz");
        }else if(5<=heat && heat<=15)
        {
            System.out.println("Sinemaya gidebilirsin");
        }else if(15<heat && heat<=25)
        {
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=25 && heat<=55)
        {
            System.out.println("Yuzmeye gidebilirsin");
        }else {
            System.out.println("Lutfen gecerli bir sicaklik degeri giriniz:");
        }

    }
}

import java.util.Scanner;

public class Siralama3sayi {
    public static void main(String[] args) {

        // Java koşullu ifadeler ile girilen 3 sayiyi
        // buyukten kucuge siralayan programi yaziniz.

        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz :");
        a = scanner.nextInt();

        System.out.println("İkinci sayiyi giriniz : ");
        b = scanner.nextInt();

        System.out.println("Ucuncu sayiyi giriniz :");
        c = scanner.nextInt();

        if (b < a && c < a) {

            if (b > c) {
                System.out.println(+a+">"+b+">"+c);
            }else {
                System.out.println(+a+">"+c+">"+b);            }

        } else if (a<b && c<b) {
            if (a>c){
                System.out.println(+b+">"+a+">"+c);
            }else {
                System.out.println(+b+">"+c+">"+a);
            }

        }else {
            if (a>b){
                System.out.println(+c+">"+a+">"+b);
            }else {
                System.out.println(+c+">"+b+">"+a);
            }
        }
    }
}

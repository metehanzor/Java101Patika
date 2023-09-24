import java.util.Scanner;

public class DaireAlanCevre {

    /*
        Java ile yaricapini kullanicidan aldiginiz dairenin
        alanini ve cevresini hesaplayan programi yaziniz.

     */

    public static void main(String[] args) {

        double yaricap,cevre,alan;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen yaricap bilgisini giriniz : ");

        yaricap = scanner.nextDouble();

        cevre = 2*pi*yaricap;
        alan = pi* (yaricap*yaricap);

        System.out.println("Daire cevre :"+cevre+"\n"+"Daire alan :"+alan);










    }


}

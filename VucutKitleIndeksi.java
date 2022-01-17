package githubPatika;
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner input = new Scanner (System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double vucutKitleEndeksi = kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz: " + vucutKitleEndeksi);

    }
}

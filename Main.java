import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvliTutar, kdvtutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();

        if (tutar >= 0 && tutar <= 1000) {
            kdvtutar = (tutar * 18) / 100;
            kdvliTutar = kdvtutar + tutar;
        } else {
            kdvtutar = (tutar * 8) / 100;
            kdvliTutar = kdvtutar + tutar;
        }

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        System.out.println("KDV Tutarı: " + kdvtutar);
    }
}






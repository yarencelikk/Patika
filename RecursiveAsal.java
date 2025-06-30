import java.util.Scanner;

public class RecursiveAsal {

    static boolean asalKontrol(int sayi, int bolen) {
        if (bolen == 1)
            return true;
        if (sayi % bolen == 0)
            return false;
        return asalKontrol(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi > 1 && asalKontrol(sayi, sayi / 2))
            System.out.println(sayi + " sayısı ASALDIR.");
        else
            System.out.println(sayi + " sayısı ASAL DEĞİLDİR.");

        input.close();
    }
}

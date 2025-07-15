import java.util.Scanner;
import java.util.Arrays;

public class DiziSirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu al
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];

        // Dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralanmış diziyi yazdır
        System.out.println("Sıralanmış dizi:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        scanner.close();
    }
}

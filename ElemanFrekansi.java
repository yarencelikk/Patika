import java.util.Scanner;
import java.util.HashMap;

public class ElemanFrekansi {
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

        // Elemanların frekansını hesaplamak için HashMap kullan
        HashMap<Integer, Integer> frekansMap = new HashMap<>();

        for (int eleman : dizi) {
            if (frekansMap.containsKey(eleman)) {
                frekansMap.put(eleman, frekansMap.get(eleman) + 1);
            } else {
                frekansMap.put(eleman, 1);
            }
        }

        // Frekansları ekrana yazdır
        System.out.println("Elemanların frekansları:");
        for (Integer key : frekansMap.keySet()) {
            System.out.println(key + " sayısı " + frekansMap.get(key) + " kez tekrar edildi.");
        }

        scanner.close();
    }
}

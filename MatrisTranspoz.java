import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrisin boyutlarını al
        System.out.print("Matrisin satır sayısını giriniz: ");
        int satir = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını giriniz: ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];

        // Matris elemanlarını al
        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpoz = new int[sutun][satir]; // sütun ve satır sayıları yer değişti

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisi yazdır
        System.out.println("\nOrijinal Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisini yazdır
        System.out.println("\nTranspoz Matris:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

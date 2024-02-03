import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("eleman sayısını girin:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int sayi) {
        if (sayi <= 2) {
            return 1;
        }
        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }
}
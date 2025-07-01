import java.util.Scanner;

public class RecursivePattern {

    static void printPattern(int n, int temp, boolean isDecreasing) {
        System.out.print(temp + " ");

        if (temp <= 0)
            isDecreasing = false;

        if (!isDecreasing && temp == n)
            return;

        if (isDecreasing)
            printPattern(n, temp - 5, true);
        else
            printPattern(n, temp + 5, false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını girin: ");
        int n = scanner.nextInt();

        printPattern(n, n, true);
    }
}
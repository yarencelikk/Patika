import java.util.Scanner;

public class Palindromik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        if (isPalindrome(kelime)) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " bir palindrom değildir.");
        }

        scanner.close();
    }

    // Palindrom kontrol fonksiyonu
    public static boolean isPalindrome(String str) {
        int sol = 0;
        int sag = str.length() - 1;

        while (sol < sag) {
            if (str.charAt(sol) != str.charAt(sag)) {
                return false;
            }
            sol++;
            sag--;
        }
        return true;
    }
}

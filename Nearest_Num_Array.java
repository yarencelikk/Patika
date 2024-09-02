import java.util.Scanner;

public class Nearest_Num_Array {
    public static void main(String[] args) {
        int [] list ={15,12,788,1,-1,-778,2,0};
        System.out.print("Lütfen bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int closestSmaller = Integer.MIN_VALUE;
        int closestGreater = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < num && list[i] > closestSmaller) {
                closestSmaller = list[i];
            }
            if (list[i] > num && list[i] < closestGreater) {
                closestGreater = list[i];
            }
        }

        if (closestSmaller == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        }

        if (closestGreater == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreater);
        }
    }
}


import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        number=input.nextInt();
        System.out.print("Dördün kuvvetleri:");
        for(int i=1;i<=number;i*=4){
                System.out.print(i+" ");
        }
        System.out.print("\nBesin kuvvetleri:");
        for(int i=1;i<=number;i*=5){
                System.out.print(i+" ");
        }
    }
}
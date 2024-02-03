import java.util.Scanner;

public class Kiyas {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int n =input.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            System.out.print(i+". sayıyı giriniz:");
            int sayi = input.nextInt();
            min= Math.min(sayi,min);
            max=Math.max(sayi,max);

        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
}

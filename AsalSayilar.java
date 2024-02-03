import java.util.Scanner;

public class AsalSayilar {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int n =input.nextInt();
        AsalYazdir(n);
    }public static boolean asalSayiBul(int sayi){
        if(sayi==1){
            return false;
        }
        for(int i=2;i<sayi;i++){
            if(sayi % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void AsalYazdir(int sayi){
        for(int i=2;i<sayi;i++){
            if(asalSayiBul(i)){
                System.out.print(i+" ");
            }
        }
    }


}

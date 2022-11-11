import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String [] args){
        int KM;
        double perKM = 2.20, total , acilis=10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz :");
        KM=input.nextInt();
        total=(perKM * KM);
        total= acilis;
        total=(total<20)? 20:total;
        System.out.println("Toplam Tutar:"+ total);


    }
}

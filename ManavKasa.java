import java.util.Scanner;
public class ManavKasa {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlıcan;
        System.out.print("Armut Kaç Kilo? :");
        armut=input.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        elma=input.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        domates=input.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        muz=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        patlıcan=input.nextDouble();

        double tutar=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.0*patlıcan);
        System.out.print("Toplam Tutar:"+tutar);

    }
}

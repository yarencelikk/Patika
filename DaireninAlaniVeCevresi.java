import java.util.Scanner;
public class DaireninAlaniVeCevresi {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int r , a;
    double pi=3.14;
        System.out.println("Yarıçap Değerini Giriniz: ");
         r = input.nextInt();

        System.out.println("Alfa Açısını Giriniz:");
        a=input.nextInt();

    double cevre=(2*pi*r);
    double alan=(pi*(r*r)*a/360);
    System.out.println("Çevre:"+ cevre);
    System.out.println("Alan:"+ alan);


    }
}
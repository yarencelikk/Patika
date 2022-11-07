import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args){
        // Değişkenlerimizi oluşturalım
        int a,b;
        double c;
        // Kullanıcıdan verilerimizi alalım.
        Scanner cikti= new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = cikti.nextInt();
        System.out.print("2. Kenarı Giriniz :");
        b = cikti.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" +c);

    }
}

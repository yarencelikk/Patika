import java.util.Scanner;
public class VKI_Hesaplama {
    public static void main(String[] args){
        double m,kg;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz(m cinsinde):");
        m=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz(kg cinsinde) :");
        kg=input.nextDouble();
        double VKI=(kg/(m*m));
        System.out.println("Vücut Kitle İndeksiniz :"+VKI);
    }
}

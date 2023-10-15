import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
     int number1,number2,select;

     Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select=input.nextInt();

        switch (select){
            case 1:
                int toplam = number1+number2;
                System.out.print("Toplam: "+toplam);
                break;
            case 2:
                int cikarma= number1-number2;
                System.out.print("Çıkarma:"+cikarma);
                break;
            case 3:
                int carpma = number1*number2;
                System.out.print("Çarpım:"+carpma);
                break;
            case 4:
                if (number2 !=0) {
                     int bolme= number1/number2;
                    System.out.print("Bölüm:" + bolme);
                }else{
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!");
        }
    }
}
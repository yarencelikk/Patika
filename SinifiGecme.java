import java.util.Scanner;
public class SinifiGecme {
    public static void main(String[]args){
        int mat,fizik,turkce,kimya,muzik,toplam;
        toplam =0;
        boolean hataliNot =false;
        double avarage;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat = input.nextInt();

        System.out.print("Fizik notu: ");
        fizik= input.nextInt();

        System.out.print("Turkce notu: ");
        turkce=input.nextInt();

        System.out.print("Kimya notu: ");
        kimya=input.nextInt();

        System.out.print("Müzik notu: ");
        muzik=input.nextInt();
      if (0<mat && mat <=100){
          toplam=+ mat;
      }else{
          System.out.println("Hatali not girişi !");
          hataliNot=true;
      }
        if (0<fizik && fizik <=100){
            toplam=+mat+fizik;
        }else{
            System.out.println("Hatali not girişi !");
            hataliNot=true;
        }
        if (0<turkce && turkce <=100){
            toplam=+ mat+fizik+turkce;
        }else{
            System.out.println("Hatali not girişi !");
            hataliNot=true;
        }
        if (0<kimya && kimya <=100){
            toplam=+ mat+fizik+turkce+kimya;
        }else{
            System.out.println("Hatali not girişi !");
            hataliNot=true;
        }
        if (0<muzik && muzik <=100){
            toplam=+mat+fizik+kimya+turkce+muzik;
        }else{
            System.out.println("Hatali not girişi !");
            hataliNot=true;
        }
        if(!hataliNot){
          avarage= (double) toplam / 5;
          System.out.println("Ortalamanız: "+avarage);
          if (avarage<55){
            System.out.println("Sınıfı Geçemediniz!");
          }else {
            System.out.println("Tebrikler.Sınıfı Geçtiniz!");
        }
        }
    }
}

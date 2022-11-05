import java.util.Scanner;

public class Notortalamasi {
    public static void main(String[] args){
        double mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextDouble();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextDouble();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextDouble();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextDouble();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextDouble();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0 ;
        System.out.println("Sonuç : " + ortalama);

        String str = ortalama >= 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);



    }

}

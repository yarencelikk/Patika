import java.util.*;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2= input.nextInt();

        int ebob=1;
        int sayac=1;
        while(sayac <= n1 && sayac <=n2){
            if(n1%sayac==0 && n2 % sayac==0){
                ebob=sayac;
            }
            sayac++;
        }
        System.out.println("EBOB:"+ebob);
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK:"+ekok);
    }

}

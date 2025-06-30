import java.util.*;
public class Mukemmel_Sayi {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Bir sayi giriniz:");
    int num= input.nextInt();
    int sum=0;
    for(int i=1;i<num;i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
      if(num==sum){
          System.out.println(num +" Mukemmel sayidir.");
      }else {
          System.out.println(num +" Mukemmel sayi değildir.");
      }
    }

}

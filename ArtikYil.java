import java.util.Scanner;

public class ArtikYil {
    public static void main(String [] args){
        int year, mode;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz: ");
        year = input.nextInt();

        if(year % 4 ==0){
            System.out.println(+year+" artık yıldır.");
        }else{
            System.out.println(+year+" artık yıl değildir.");
        }
    }
}

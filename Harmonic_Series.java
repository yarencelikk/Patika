import java.util.Scanner;
public class Harmonic_Series {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        double result=0;
        for(int i=1;i<=number;i++){
            result += (double) 1/i;
        }
        System.out.println("Result is "+result);

    }
}

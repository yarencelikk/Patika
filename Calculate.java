import java.util.Scanner;
public class Calculate {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int stepValue =0;
        int result=0;
        while (tempNumber !=0){
            stepValue = tempNumber %10;
            result +=stepValue;
            tempNumber /=10;
        }
        System.out.println("Sum = "+result);
    }
}

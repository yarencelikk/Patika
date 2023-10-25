import java.util.Scanner;
public class Sum_multipleOf_4 {
    public static void main(String[]args){
        int n,sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter numbers: ");
        do{
            n =input.nextInt();
            if(n%4==0){
                sum +=n;
            }
        }while(n%2!=1);
        System.out.print("Sum is :"+sum);

    }
}

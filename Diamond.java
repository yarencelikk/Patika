import java.util.Scanner;
public class Diamond {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();;
        for(int i=1;i<=number;i++){
            for(int k =1;k<=number-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=number-1;i>0;i--){
            for(int k =number;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

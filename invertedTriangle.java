import java.util.Scanner;
public class invertedTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n= input.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<1+(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

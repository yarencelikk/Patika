import java.util.Scanner;

public class Average {
    public static void main(String []args){
        int n,sum =0,count=0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = input.nextInt();
        if(n<=0){
            System.out.println("Enter a positive value!");
        }
        for(int i=0;i<=n;i++){
            if(i % 3==0 && i % 4==0){
                sum+=i;
                count++;
            }
        }
            average = (double) sum / count;
            System.out.println("Average is " + average);

    }
}

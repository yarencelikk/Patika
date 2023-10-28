import java.util.Scanner;
public class Combination_Calculator {
    public static void main (String [] args){
        int n,r;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number(n): ");
        n=input.nextInt();
        System.out.print("Enter second number(r): ");
        r=input.nextInt();
        double nFactorial = calculateFactorial(n);
        double rFactorial = calculateFactorial(r);
        double nrFactorial = calculateFactorial(n - r);
        result = nFactorial / (rFactorial * nrFactorial);
        System.out.println("C(" + n + "," + r + "): " + result);
    }
        public static double calculateFactorial(int num){
            double factorial = 1;
            for(int i=1; i<=num;i++){
                factorial*=i;
            }
            return factorial;
        }

    }


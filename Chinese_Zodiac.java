import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[]args){
        int year , mode;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = input.nextInt();
        mode = year % 12;
        switch (mode){
            case 0:
                System.out.println("Your chinese zodiac : Monkey");
                break;
            case 1:
                System.out.println("Your chinese zodiac : Cock");
                break;
            case 2:
                System.out.println("Your chinese zodiac : Dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac : Pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac : Mouse");
                break;
            case 5:
                System.out.println("Your chinese zodiac : Ox");
                break;
            case 6:
                System.out.println("Your chinese zodiac : Tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac : Rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac : Dragon");
                break;
            case  9:
                System.out.println("Your chinese zodiac : Snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac : Horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac : Sheep");
                break;
        }
    }
}

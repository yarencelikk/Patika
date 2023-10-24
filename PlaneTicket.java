import java.util.Scanner;
public class PlaneTicket {
    public static void main(String[] args) {
        float distance, price, discounted_price, new_discounted_price;
        int age, selection;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter distance(km): ");
        distance = input.nextFloat();

        System.out.print("Please enter costumer's age: ");
        age = input.nextInt();

      if(age>0 && distance>0) {
          System.out.print("Please choose ticket type\nFor one_way enter 1\nFor round_trip enter 2\nSelection:");
          selection = input.nextInt();

          price = (float) (distance * 0.10);
          if (age < 12) {
              discounted_price = (float) (price * 0.5);
              if (selection == 1) {
                  System.out.println("Price is: " + discounted_price);
              } else if (selection == 2) {
                  new_discounted_price = (float) (discounted_price * 0.8 * 2);
                  System.out.println("Price is: " + new_discounted_price);
              } else {
                  System.out.println("Selection is wrong");
              }
          } else if (age <= 24) {
              discounted_price = (float) (price * 0.9);
              if (selection == 1) {
                  System.out.println("Price is: " + discounted_price);
              } else if (selection == 2) {
                  new_discounted_price = (float) (discounted_price * 0.8 * 2);
                  System.out.println("Price is: " + new_discounted_price);
              } else {
                  System.out.println("Selection is wrong");
              }
          } else if (age > 65) {
              discounted_price = (float) (price * 0.7);
              if (selection == 1) {
                  System.out.println("Price is: " + discounted_price);
              } else if (selection == 2) {
                  new_discounted_price = (float) (discounted_price * 0.8 * 2);
                  System.out.println("Price is: " + new_discounted_price);
              } else {
                  System.out.println("Selection is wrong");
              }
          } else {
              if (selection == 1) {
                  System.out.println("Price is:" + price);
              } else if (selection == 2) {
                  discounted_price = (float) (price * 0.8 * 2);
                  System.out.println("Price is: " + discounted_price);
              } else {
                  System.out.println("Selection is wrong");
              }

          }
      }else{
          System.out.println("Incorrect Data Entry!");
      }
    }
}

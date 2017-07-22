/*Ordering Robot
 */
package ordering.robot;

import java.util.Scanner;
import static ordering.robot.orders.input;
import static ordering.robot.orders.menu;
import static ordering.robot.orders.ordering;
import static ordering.robot.orders.productCost;

/***********************
 * @author Aaron Ali   *
 ***********************/

public class OrderingRobot {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
  double runningTotal=0;
  do{
    menu();
    menuOption = input.nextInt();
    switch(menuOption){
      case 1:
        foodItem = 1;
        runningTotal += productCost(foodItem);
        break;
      case 2:
        foodItem = 2;
        runningTotal += productCost(foodItem);
        break;
      case 3:
        foodItem = 3;
        runningTotal += productCost(foodItem);
        break;
      default:
        System.out.println("Invalid option.");
    }
  } while(ordering);
  System.out.println("Total amount: " + runningTotal);
 }
 
}

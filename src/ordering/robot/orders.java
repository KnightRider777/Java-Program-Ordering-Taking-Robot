/*
 */
package ordering.robot;

import java.util.Scanner;

/***********************
 * @author Aaron Ali   *
 ***********************/

public class orders {
    
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    private static double productCost;
    public static double runningTotal; 
    public double subTotol;
    
    public static void menu() {
        System.out.println("Welcome New Customer, I am Robot, May I Take Your Order?"
                + "\n1. Coca-Cola ($10.00) \n2. Sprite ($8.00)\n3. Pepsi ($5.00) \n. --------------------------------");
        
        System.out.print( "Please Enter An Order Number(1,2,3): " );
    }
    
    public static double productCost(int drinkItem) {
        if (drinkItem == 1) {
            // a Coca-Cola costs $10.00
            System.out.println("You've ordered a Coca-Cola");
            productCost = 10.00;
        }
        if (drinkItem == 2) {
            // a Sprite costs )  = $8.00
            System.out.println("You've ordered Sprite");
            productCost = 8.00;
        }
        if (drinkItem == 3) {
            // a Papsi costs = $5.00
            System.out.println("You've ordered a Pepsi");
            productCost = 5.00;
        }
        quantity();
        return productCost;
    }

    public static double quantity() {
        System.out.print("\nEnter Quantity: ");
        double quantity = input.nextDouble();
        subTotal(quantity, productCost);
        return quantity;
    }

    public static double subTotal(double quantity, double productCost) {
        double subTotal = quantity * productCost;
        System.out.println("Subtotal: $1" + subTotal);
        System.out.println("Enjoy your Drink!!");
        System.out.println("\n");
        return subTotal;
    }

}

import java.util.*;
import java.text.NumberFormat;
public class Order {
    public static void main(String[]args){
        int burgers;
        int fries;
        int sodas;
        double price;
        double tax;
        double truePrice;
        double paid;
        double change;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter the number of burgers: ");
        burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        sodas = input.nextInt();
        NumberFormat number = NumberFormat.getCurrencyInstance();
        price = (burgers*1.69)+(fries*1.09)+(sodas*0.99);
        System.out.println("Total before tax: "+ number.format(price));
        tax = (price/100)*8.5;
        System.out.println("Tax: "+ number.format(tax));
        truePrice = price + tax;
        System.out.println("Final Total: "+number.format(truePrice));
        System.out.print("Enter the amount tendered: ");
        paid = input.nextDouble();
        change = paid-truePrice;
        System.out.println("Change: "+number.format(change));
        System.out.println("Thanks, "+name+", for coming to our fast food restaurant!");
    }
}

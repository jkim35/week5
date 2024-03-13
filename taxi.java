import java.util.*;
public class taxi {
    public static void main(String[]args){
        int passengers;
        int cabs;
        int leftover;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbre of passengers: ");
        passengers = input.nextInt();
        leftover = passengers%4;
        cabs = (passengers-leftover)/4;
        System.out.println(cabs+" cabs are required");
        System.out.println(leftover + " passengers(s) will be left over");

    }
}

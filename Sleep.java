import java.util.*;
import java.text.NumberFormat;
public class Sleep {
    public static void main(String[]args){
        int birthYear;
        int birthMonth;
        int birthDay;
        int year;
        int month;
        int day;
        int total;
        int birthTotal;
        int alive;
        double sleep;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your birthdate.");
        System.out.print("Year: ");
        birthYear = input.nextInt();
        System.out.print("Month: ");
        birthMonth = input.nextInt();
        System.out.print("Day: ");
        birthDay = input.nextInt();
        System.out.println("Enter your today's date.");
        System.out.print("Year: ");
        year = input.nextInt();
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Day: ");
        day = input.nextInt();
        total = (year*365)+(month*30)+day;
        birthTotal = (birthYear*365)+(birthMonth*30)+birthDay;
        alive = total-birthTotal;
        sleep = (alive*24)/3;
        NumberFormat number = NumberFormat.getNumberInstance();
        System.out.println("You've been alive for "+ number.format(alive)+" days.");
        System.out.println("You've slept for "+number.format(sleep)+" hours.");
    }
}

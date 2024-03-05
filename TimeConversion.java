import java.util.*;
public class TimeConversion {
    public static void main(String[]args){
        int timeInMinutes;
        int hour;
        int minute;
        Scanner input = new Scanner (System.in);
        System.out.print("What is the time in minutes? ");
        timeInMinutes = input.nextInt();
        minute = timeInMinutes%60;
        hour = (timeInMinutes-minute)/60;
        if (minute < 10){
            System.out.println("The time is: "+hour+":0"+minute);
        }
        else{
            System.out.println("The time is: "+hour+":"+minute);
        }
    }
}

//Aim: Write a Java program to get a day of the week of a specific date. 

//Code:
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

public class DayOfWeek {
    
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the date in format yyyy-MM-dd: ");  
        String str= sc.nextLine();        

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String dayOfWeekString = "";
        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "Sunday";
                break;
            case 2:
                dayOfWeekString = "Monday";
                break;
            case 3:
                dayOfWeekString = "Tuesday";
                break;
            case 4:
                dayOfWeekString = "Wednesday";
                break;
            case 5:
                dayOfWeekString = "Thursday";
                break;
            case 6:
                dayOfWeekString = "Friday";
                break;
            case 7:
                dayOfWeekString = "Saturday";
                break;
            default:
                break;
        }
        System.out.println(dayOfWeekString);
    }
}

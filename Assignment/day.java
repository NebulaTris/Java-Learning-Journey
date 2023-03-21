//Aim: Write a Java program to get a day of the week of a specific date. 

//Code:
import java.util.*;
public class day {
public static void main(String []args){

        Calendar cal = Calendar.getInstance();

	System.out.println();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek); 
	System.out.println();
    }
}

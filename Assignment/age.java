//Aim: Write a Java program to calculate your age.

//Code:
import java.time.*;
import java.util.*;

public class age {  
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year of Birth: ");
        int y=sc.nextInt();
        System.out.println("Input Month of Birth: ");
        int m=sc.nextInt();
        System.out.println("Input Day of Birth: ");
        int d=sc.nextInt();
        LocalDate pdate = LocalDate.of(y, m, d);

        LocalDate now = LocalDate.now();
        
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nYou are  %d years, %d months and %d days old.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
   }
}

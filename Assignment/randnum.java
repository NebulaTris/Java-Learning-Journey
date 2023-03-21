/*Aim:Write a Java program which first generates a set of random numbers and then determines negative, positive even, positive odd numbers concurrently.*/

//Code:
import java.util.Random;

public class randnum {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(1000) - 100; //This can be changed according to your needs.
        }
        
        System.out.print("Random Numbers: ");
        printArray(numbers);
        
        int[] neg = new int[10];
        int[] poseven = new int[10];
        int[] posodd = new int[10];
        
        int negindex = 0;
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int number : numbers) {
            if (number < 0) {
                neg[negindex++] = number;
            } else if (number % 2 == 0) {
                poseven[evenIndex++] = number;
            } else {
                posodd[oddIndex++] = number;
            }
        }
        
        System.out.print("Negative Numbers: ");
        printArray(neg, negindex);
        
        System.out.print("Positive Even Numbers: ");
        printArray(poseven, evenIndex);
        
        System.out.print("Positive Odd Numbers: ");
        printArray(posodd, oddIndex);
    }
    
    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

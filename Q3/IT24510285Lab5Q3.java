import java.util.Scanner;

public class IT24510285Lab5Q3 {
    
    
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_FOR_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_FOR_5_OR_MORE_DAYS = 20;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            scanner.close();
            return; 
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            scanner.close();
            return;  
        }

      
        int numberOfDays = endDate - startDate + 1;

        
        System.out.println("Number of days reserved: " + numberOfDays);

        
        double totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays;

        
        if (numberOfDays >= 5) {
            totalAmount -= (totalAmount * DISCOUNT_FOR_5_OR_MORE_DAYS / 100);
            System.out.println("You are entitled to a 20% discount.");
        } else if (numberOfDays >= 3) {
            totalAmount -= (totalAmount * DISCOUNT_FOR_3_TO_4_DAYS / 100);
            System.out.println("You are entitled to a 10% discount.");
        } else {
            System.out.println("No discount available for reservations less than 3 days.");
        }

        
        System.out.println("Total amount to be paid: Rs " + totalAmount);

       
        scanner.close();
    }
}

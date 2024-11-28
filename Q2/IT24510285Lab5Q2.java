import java.util.Scanner;

public class IT24510285Lab5Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of new members you have introduced: ");
        int newMembers = scanner.nextInt();

        
        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members must be greater than or equal to 0.");
        } else {
            
            String prize;
            if (newMembers == 0) {
                prize = "No Prize";
            } else if (newMembers == 1) {
                prize = "Pen";
            } else if (newMembers == 2) {
                prize = "Umbrella";
            } else if (newMembers == 3) {
                prize = "Bag";
            } else if (newMembers == 4) {
                prize = "Travelling Chair";
            } else {
                prize = "Headphone";
            }

            
            System.out.println("The prize you are entitled to: " + prize);
        }

      
        scanner.close();
    }
}

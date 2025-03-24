import java.util.Scanner;

public class PortfolioProject {

    public static void main(String[] args) {
        
        commitChanges();
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.print("Initialize new files? (Y/N): ");
                String userInput = scanner.nextLine();

                if (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N")) {
                    throw new IllegalArgumentException("Invalid input. Please enter Y or N.");
                }
            
                if (userInput.equalsIgnoreCase("Y")) {
                    // Proceed with file creation435
                    System.out.print("Initializing new files now and committing to Timestamps.txt.");
                } else {
                    System.out.print("New files will not initialize.");
                }
                break;
            
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                // You can loop or retry if you want
            }
            }
        }
    }

import java.util.Scanner;

public class CT1 {
    public static void main(String[] args) {
        String[] personalInfo = personal_info();
        print_personal_info(personalInfo);

    }
    public static void print_personal_info(String[] input_info){
        System.out.println("\nPrinting Personal Information:");
        System.out.println("Forename: " + input_info[0]);
        System.out.println("Surname: " + input_info[1]);
        System.out.println("Street Address: " + input_info[2]);
        System.out.println("City: " + input_info[3]);
        System.out.println("Zip Code: " + input_info[4]);
        }

    public static String[] personal_info() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please begin entering information, pressing enter after each line.");
        System.out.print("\nForename: ");
        String forename = scanner.nextLine();

        System.out.print("Surname: ");
        String surname = scanner.nextLine();

        System.out.print("Street Address: ");
        String street_address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Zip code: ");
        String zip_code = scanner.nextLine();

        String[] info_array = { forename, surname, street_address, city, zip_code };
        scanner.close();

        return info_array;
        }
}

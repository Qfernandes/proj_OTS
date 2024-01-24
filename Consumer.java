import java.util.Scanner;
/**
 * Write a description of class Consumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consumer
{
        private String name;
        private String houseNumber;
        private String street;
        private String addressPostcode;
        private String email;
    public Consumer()
    {
        
        Scanner input = new Scanner(System.in);
        
            System.out.print("Enter your Name: ");
            name = input.nextLine();
            System.out.print("Enter your House Number: ");
            houseNumber = input.nextLine();
            System.out.print("Enter your Street: ");
            street = input.nextLine();
            System.out.print("Enter your Post Code: ");
            addressPostcode = input.nextLine();
            System.out.print("Enter your Email: ");
            email = input.nextLine();
        
            printConsumerInfo();
    }
    public void printConsumerInfo()
    {
        System.out.println("Consumer Information:");
        System.out.println("Name: " + name);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Street: " + street);
        System.out.println("Post Code: " + addressPostcode);
        System.out.println("Email: " + email);
    }
}


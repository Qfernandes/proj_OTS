import java.util.Scanner;

public class UserInput {

    public UserInput(Scanner input) {
        String user;
        String pass;
        boolean loggedIn = false;
        
        do {
            System.out.print("Enter username: ");
            user = input.nextLine();
            System.out.print("Enter password: ");
            pass = input.nextLine();
            
            if (user.equals("Hannah") && pass.equals("Hay")) {
                System.out.println("You are logged in");
                loggedIn = true;
            } else {
                System.out.println("Incorrect, try again");
            }
        } while (!loggedIn);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
    }
}

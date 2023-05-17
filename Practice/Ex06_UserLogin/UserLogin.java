package Ex06_UserLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        // created variables
        String userName, password, select;

        // taken username and password data from user
        Scanner inp = new Scanner(System.in);
        System.out.print("Username: ");
        userName = inp.nextLine();

        System.out.print("Password: ");
        password = inp.nextLine();

        // check Username and Password
        if (userName.equals("username016") && password.equals("Java123")){
            System.out.println("You are logged in");
        } else { // If the login is unsuccessful, a new password has been set from the user.
            System.out.print("Your Login Information is Incorrect!\nDo you want to reset your password?\n- Yes\n- No\n------\n");
            select = inp.nextLine();
            if(select.equals("Yes")){
                System.out.print("New Password : ");
                password = inp.nextLine();
                if (password.equals("Java123"))
                    System.out.println("Could not create password, please enter another password");
                else
                    System.out.println("Your password created");
            }
            else if (select.equals("No")) // If the user does not want to create a new password, the system has been exited.
                System.out.println("Redirecting to homepage\n***\n**\n*\nLog out!");
            else
                System.out.println("Invalid selection!");
        }
    }
}

package Ex19_ATMProject;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        // created variable
        String userName, password;
        Scanner input = new Scanner(System.in); // created input object to receive data from user
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) { //user error login restricted
            // username and password retrieved
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            // Username and password queried
            if (userName.equals("username016") && password.equals("java101")){
                System.out.println("Login to the System");
                System.out.println("Hello, Welcome to We Are Coding Bank");
                do { // commands that the user will want to do are listed
                    System.out.println("""
                            1- Deposit
                            2- Withdraw money
                            3- Balance Inquiry
                            4- Log out""");
                    System.out.println("--------------------------------------------");
                    System.out.print("Please select the action you want to do "); // got a selection
                    select = input.nextInt();
                    System.out.println("--------------------------------------------");
                    if (select == 1){ // deposit has been made
                        System.out.println("--------------------------------------------");
                        System.out.print("Amount to Deposit: ");
                        int price = input.nextInt();
                        System.out.println("--------------------------------------------");
                        balance += price;
                    }else if(select == 2){ // Withdrawal made
                        System.out.println("--------------------------------------------");
                        System.out.print("Amount To Be Withdrawn: ");
                        int price = input.nextInt();
                        System.out.println("--------------------------------------------");
                        if (price > balance) {
                            System.out.println("--------------------------------------------");
                            System.out.println("Insufficient balance!");
                            System.out.println("--------------------------------------------");
                        }
                        else
                            balance -= price;
                    } else if (select == 3) { // balance inquiry made
                        System.out.println("--------------------------------------------");
                        System.out.println("Balance: "+ balance);
                        System.out.println("--------------------------------------------");
                    }
                }while (select != 4); // exited to program
                System.out.println("--------------------------------------------");
                System.out.println("Log out");
                System.out.println("--------------------------------------------");
                break;
            }
            else {
                right--; // user login attempt reduced
                System.out.println("You entered an incorrect Username or Password\nPlease try again!");
                if(right == 0) // If there is no right, a warning message is given.
                    System.out.println("Your account has been blocked, please contact the bank");
                else
                    System.out.println("Remaining rights: " + right); // the remaining right is printed on the screen
            }
        }
    }
}

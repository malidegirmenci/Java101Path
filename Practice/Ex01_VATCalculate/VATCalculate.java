package Ex01_VATCalculate;

import java.util.Scanner;

public class VATCalculate {
    public static void main(String[] args) {

        // created variables
        double amount, priceWithVAT, VATprice, VATrate;

        // created ınput object from Scanner Class
        Scanner amountInput = new Scanner(System.in);

        System.out.print("Please write to Fee Amount:  ");
        amount = amountInput.nextDouble();

        VATrate = (amount >= 0) && (amount < 1000) ? 0.18 : 0.08;

        VATprice = amount * VATrate;
        priceWithVAT = (amount + VATprice);

        System.out.println("Amount without VAT: " + amount + " TL");
        System.out.println("VAT rate: " + VATrate);
        System.out.println("VAT amount: " + VATprice + " TL");
        System.out.println("Amount with VAT: "+ priceWithVAT + " TL");
    }
}

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        // Predefined exchange rates
        double usdToEur = 0.92;   // Example: 1 USD = 0.92 EUR
        double usdToGbp = 0.81;   // Example: 1 USD = 0.81 GBP
        double eurToUsd = 1.09;   // Example: 1 EUR = 1.09 USD
        double eurToGbp = 0.88;   // Example: 1 EUR = 0.88 GBP
        double gbpToUsd = 1.23;   // Example: 1 GBP = 1.23 USD
        double gbpToEur = 1.14;   // Example: 1 GBP = 1.14 EUR
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display options
        System.out.println("Currency Converter");
        System.out.println("Select the currency you want to convert from:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.print("Enter choice (1/2/3): ");
        int fromCurrency = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        
        System.out.println("Select the currency you want to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.print("Enter choice (1/2/3): ");
        int toCurrency = scanner.nextInt();
        
        double convertedAmount = 0;
        
        // Conversion logic
        if (fromCurrency == 1 && toCurrency == 2) {
            convertedAmount = amount * usdToEur;
        } else if (fromCurrency == 1 && toCurrency == 3) {
            convertedAmount = amount * usdToGbp;
        } else if (fromCurrency == 2 && toCurrency == 1) {
            convertedAmount = amount * eurToUsd;
        } else if (fromCurrency == 2 && toCurrency == 3) {
            convertedAmount = amount * eurToGbp;
        } else if (fromCurrency == 3 && toCurrency == 1) {
            convertedAmount = amount * gbpToUsd;
        } else if (fromCurrency == 3 && toCurrency == 2) {
            convertedAmount = amount * gbpToEur;
        } else if (fromCurrency == toCurrency) {
            convertedAmount = amount; // No conversion needed if same currency
        } else {
            System.out.println("Invalid currency selection.");
            return;
        }

        System.out.println("Converted amount: " + convertedAmount);
    }
}

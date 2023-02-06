public class Main {

    public static void main(String[] args) {

    double purchasePrice = 100;
    double taxRate = .05;
    double salesTaxAmount = 0;
    salesTaxAmount = taxRate * purchasePrice; // calculate the sales tax amount  by multiplying .05 by the purchase price
    System.out.println("The sales tax on a purchase of $" + purchasePrice + " is $" + salesTaxAmount); // outputs the purchase price and the tax dollar amount

    }
}

import vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        int balance = 50;

        vendingMachine.displayItems(balance);

        String result = vendingMachine.purchaseItem(balance, 2);
        System.out.println(result);
    }
}
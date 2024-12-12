package vending;

public class VendingMachine {
    private String[] items;
    private int[] prices;

    public VendingMachine() {
        this.items = new String[]{"Water", "Coca Cola", "Soda", "Snickers", "Mars", "Pistachios"};
        this.prices = new int[]{20, 50, 30, 80, 80, 130};
    }

    public void displayItems(int balance) {
        System.out.println("В автомате доступны:");
        for (int i = 0; i < items.length; i++) {
            if (balance >= prices[i]) {
                System.out.printf("[%d] - %s (Цена: %d)%n", i + 1, items[i], prices[i]);
            }
        }
    }

    public String purchaseItem(int balance, int itemIndex) {
        if (itemIndex < 1 || itemIndex > items.length) {
            return "Такого товара нет!";
        }

        int index = itemIndex - 1;
        if (balance >= prices[index]) {
            return "Вы купили: " + items[index];
        } else {
            return "Недостаточно средств для покупки " + items[index];
        }
    }
}

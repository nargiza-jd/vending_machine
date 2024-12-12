package vending;
public class CoinReceiver implements PaymentReceiver {
    private int balance = 0;

    @Override
    public void addFunds(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Вы добавили: %d монет.", amount);
        } else {
            System.out.println("Невозможно добавить отрицательное значение.");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public boolean deductFunds(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.printf("Недостаточно средств. Баланс: %d", balance);
            return false;
        }
    }

    @Override
    public void reset() {
        balance = 0;
    }
}

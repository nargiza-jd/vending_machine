package vending;

public interface PaymentReceiver {
    void addFunds(int amount);
    int getBalance();
    boolean deductFunds(int amount);
    void reset();
}

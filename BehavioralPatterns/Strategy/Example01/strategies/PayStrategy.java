package BehavioralPatterns.Strategy.Example01.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}

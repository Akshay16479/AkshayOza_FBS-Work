package model;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private int fromUserId;
    private int toUserId;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String transactionId, int fromUserId, int toUserId, double amount) {
        this.transactionId = transactionId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public double getAmount() {
        return amount;
    }
}

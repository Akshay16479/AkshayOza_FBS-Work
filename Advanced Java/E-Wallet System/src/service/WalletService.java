package service;

import exception.InsufficientBalanceException;
import exception.UserNotFoundException;

public interface WalletService {

    void createUser(int userId, String name, String mobile);

    void addMoney(int userId, double amount) throws UserNotFoundException;

    void transferMoney(int fromUserId, int toUserId, double amount)
            throws UserNotFoundException, InsufficientBalanceException;

    double checkBalance(int userId) throws UserNotFoundException;
}

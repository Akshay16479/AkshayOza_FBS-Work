package dao;

import model.Transaction;
import model.User;
import model.Wallet;

public interface WalletDao {

    void saveUser(User user);

    User getUser(int userId);

    void saveWallet(Wallet wallet);

    Wallet getWallet(int userId);

    void updateWallet(Wallet wallet);

    void saveTransaction(Transaction transaction);
}

package serviceimpl;

import dao.WalletDao;
import daoimpl.WalletDaoImpl;
import exception.InsufficientBalanceException;
import exception.UserNotFoundException;
import model.Transaction;
import model.User;
import model.Wallet;
import service.WalletService;
import util.IdGenerator;

public class WalletServiceImpl implements WalletService {

    private WalletDao walletDao = new WalletDaoImpl();

    @Override
    public void createUser(int userId, String name, String mobile) {
        User user = new User(userId, name, mobile);
        Wallet wallet = new Wallet(userId, 0.0);

        walletDao.saveUser(user);
        walletDao.saveWallet(wallet);
    }

    @Override
    public void addMoney(int userId, double amount) throws UserNotFoundException {
        Wallet wallet = walletDao.getWallet(userId);
        if (wallet == null) {
            throw new UserNotFoundException("User not found");
        }
        wallet.setBalance(wallet.getBalance() + amount);
        walletDao.updateWallet(wallet);
    }

    @Override
    public void transferMoney(int fromUserId, int toUserId, double amount)
            throws UserNotFoundException, InsufficientBalanceException {

        Wallet fromWallet = walletDao.getWallet(fromUserId);
        Wallet toWallet = walletDao.getWallet(toUserId);

        if (fromWallet == null || toWallet == null) {
            throw new UserNotFoundException("User not found");
        }

        if (fromWallet.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);

        walletDao.updateWallet(fromWallet);
        walletDao.updateWallet(toWallet);

        Transaction transaction = new Transaction(
                IdGenerator.generateTransactionId(),
                fromUserId,
                toUserId,
                amount
        );

        walletDao.saveTransaction(transaction);
    }

    @Override
    public double checkBalance(int userId) throws UserNotFoundException {
        Wallet wallet = walletDao.getWallet(userId);
        if (wallet == null) {
            throw new UserNotFoundException("User not found");
        }
        return wallet.getBalance();
    }
}

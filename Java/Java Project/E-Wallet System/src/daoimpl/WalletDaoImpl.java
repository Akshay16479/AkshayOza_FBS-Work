package daoimpl;

import dao.WalletDao;
import model.Transaction;
import model.User;
import model.Wallet;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WalletDaoImpl implements WalletDao {

    private Connection connection = DBConnection.getConnection();

    @Override
    public void saveUser(User user) {
        try {
            String sql = "INSERT INTO users VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, user.getUserId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getMobile());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(int userId) {
        try {
            String sql = "SELECT * FROM users WHERE user_id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("mobile")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveWallet(Wallet wallet) {
        try {
            String sql = "INSERT INTO wallets VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, wallet.getUserId());
            ps.setDouble(2, wallet.getBalance());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Wallet getWallet(int userId) {
        try {
            String sql = "SELECT * FROM wallets WHERE user_id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Wallet(
                        rs.getInt("user_id"),
                        rs.getDouble("balance")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateWallet(Wallet wallet) {
        try {
            String sql = "UPDATE wallets SET balance=? WHERE user_id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1, wallet.getBalance());
            ps.setInt(2, wallet.getUserId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        try {
            String sql = "INSERT INTO transactions VALUES (?, ?, ?, ?, NOW())";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, transaction.getTransactionId());
            ps.setInt(2, transaction.getFromUserId());
            ps.setInt(3, transaction.getToUserId());
            ps.setDouble(4, transaction.getAmount());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

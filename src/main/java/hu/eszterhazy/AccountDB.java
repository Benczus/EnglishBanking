package hu.eszterhazy;

public interface AccountDB {

    Account queryAccount(String name);
    void removeAccount(Account account);
    void removeAccount(String accountName);
    void addAccount(Account account);
    void updateAccount(Account account, String newName, String newPassword);
}

package hu.eszterhazy;

import java.util.ArrayList;
import java.util.List;

public class AccountMemoryDB implements AccountDB{

    List<Account> accountList;

    public AccountMemoryDB(List<Account> accountList) {
        this.accountList = accountList;
    }

    public AccountMemoryDB() {
        this.accountList= new ArrayList<>();
    }

    @Override
    public Account queryAccount(String name) {
        for(Account account:this.accountList){
            if(account.getUsername().equals(name)){
                return account;
            }
        }
        return null;
    }

    @Override
    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }

    @Override
    public void removeAccount(String accountName) {
        for(Account account:this.accountList){
            if(account.getUsername().equals(accountName)){
                this.accountList.remove(account);
                break;
            }
        }
    }

    @Override
    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public void updateAccount(Account account, String newName, String newPassword) {
        int index=this.accountList.indexOf(account);
        this.accountList.get(index).setPassword(newPassword);
        this.accountList.get(index).setUsername(newName);
    }
}

package hu.eszterhazy;

import java.util.UUID;

public class DigitalBank implements Bank{
    private String ownerName;
    private String name;
    private final UUID id;
    private AccountDB accountDB;


    public DigitalBank(String ownerName, String name, UUID id, AccountDB accountDB) {
        this.ownerName = ownerName;
        this.name = name;
        this.id = id;
        this.accountDB = accountDB;
    }

    public DigitalBank(String ownerName, String name, AccountDB accountDB) {
        this.ownerName = ownerName;
        this.name = name;
        this.id= UUID.randomUUID();
        this.accountDB= accountDB;

    }

    public UUID getId() {
        return id;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getOwnerName() {
        return this.ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName=ownerName;
    }

    @Override
    public void registerAccount(Account account) {

    }

    public boolean authenticateAccount(String name, String password){
       Account account= accountDB.queryAccount(name);
       return account != null && account.getPassword().equals(password);
    }

}

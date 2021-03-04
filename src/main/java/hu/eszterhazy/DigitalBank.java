package hu.eszterhazy;

import java.util.UUID;

public class DigitalBank implements Bank{
    private String ownerName;
    private String name;
    private final UUID id;

    public DigitalBank(String ownerName, String name, UUID id) {
        this.ownerName = ownerName;
        this.name = name;
        this.id = id;
    }

    public DigitalBank(String ownerName, String name) {
        this.ownerName = ownerName;
        this.name = name;
        this.id= UUID.randomUUID();
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

    public boolean authenticateAccount(String name, String password){
        return false;
    }

}

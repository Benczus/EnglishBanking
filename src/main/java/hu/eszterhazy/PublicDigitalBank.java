package hu.eszterhazy;

import java.util.UUID;

public class PublicDigitalBank extends DigitalBank{

    public UUID getPublicId() {
        return publicId;
    }

    private final UUID publicId;

    public PublicDigitalBank(String ownerName, String name, AccountDB accountDB) {
        super(ownerName, name, accountDB);
        this.publicId = UUID.randomUUID();
    }

    public PublicDigitalBank(String ownerName, String name,UUID id, AccountDB accountDB) {
        super(ownerName, name, id, accountDB);
        this.publicId = UUID.randomUUID();
    }

    @Override
    public String getName() {
        return super.getName() + " Public Digital Bank";
    }

    @Override
    public boolean authenticateAccount(String name, String password) {
        return super.authenticateAccount(name, password);
    }
}

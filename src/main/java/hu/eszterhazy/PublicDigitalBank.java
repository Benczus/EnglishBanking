package hu.eszterhazy;

import java.util.UUID;

public class PublicDigitalBank extends DigitalBank{

    public UUID getPublicId() {
        return publicId;
    }

    private final UUID publicId;

    public PublicDigitalBank(String ownerName, String name, UUID id) {
        super(ownerName, name, id);
        this.publicId = UUID.randomUUID();
    }

    public PublicDigitalBank(String ownerName, String name) {
        super(ownerName, name);
        this.publicId = UUID.randomUUID();
    }

    @Override
    public String getName() {
        return super.getName() + " Public Digital Bank";
    }



}

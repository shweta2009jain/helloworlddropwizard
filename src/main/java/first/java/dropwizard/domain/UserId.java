package first.java.dropwizard.domain;

import java.util.UUID;

public class UserId {

    private UUID id;

    public UserId create() {
        return new UserId(UUID.randomUUID());
    }


    public static UserId parse(String id) {
        return new UserId(UUID.fromString(id));
    }

    private UserId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}

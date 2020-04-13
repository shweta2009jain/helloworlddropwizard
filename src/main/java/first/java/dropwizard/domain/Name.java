package first.java.dropwizard.domain;

public class Name {

    private UserId userId;
    private String firstName;
    private String lastName;

    public Name(UserId userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

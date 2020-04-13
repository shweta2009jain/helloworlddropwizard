package first.java.dropwizard.port.rest.family;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import first.java.dropwizard.domain.Name;

public class NameDto {

    private String firstName;

    private String lastName;

    @JsonCreator
    private NameDto(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public NameDto(Name name) {
        this.firstName = name.getFirstName();
        this.lastName = name.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

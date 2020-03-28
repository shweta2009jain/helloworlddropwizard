package first.java.dropwizard.port.rest.family;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FamilyMemberNameDto {

    @JsonProperty("name")
    private String name;

    public FamilyMemberNameDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

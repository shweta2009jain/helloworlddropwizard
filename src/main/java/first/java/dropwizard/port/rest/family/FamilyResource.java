package first.java.dropwizard.port.rest.family;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("shweta-home")
public class FamilyResource {

    @GET
    @Path("member-name")
    @Produces(MediaType.APPLICATION_JSON)
    public FamilyMemberNameDto getFamilyMemberName() {
        return new FamilyMemberNameDto("shweta");
    }
}

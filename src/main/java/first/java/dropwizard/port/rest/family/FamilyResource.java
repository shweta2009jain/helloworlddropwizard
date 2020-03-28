package first.java.dropwizard.port.rest.family;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("shweta-home")
public class FamilyResource {

    @GET
    @Path("member-name")
    @Produces("text/plain")
    public String getFamilyMemberName() {
        return "member-name-string";
    }
}

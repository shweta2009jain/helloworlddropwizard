package first.java.dropwizard.port.rest.family;

import first.java.dropwizard.domain.Name;
import first.java.dropwizard.domain.UserId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("shweta-home")
public class FamilyResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(FamilyResource.class);

    @GET
    @Path("member-name/{member_id}")
    @Produces(APPLICATION_JSON)
    public Response getFamilyMemberName(@Valid @NotNull @PathParam("member_id") String userIdString) {
        LOGGER.info("Get full name of family member with userId [{}]", userIdString);

        Name name = new Name(UserId.parse(userIdString), "shweta", "jain"); // get Name from database with userId

        NameDto nameDto = new NameDto(name);
        return Response.ok().entity(nameDto).build();
    }


    @POST
    @Path("member-name")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response updateFamilyMemberName(@NotNull NameDto name) {
        LOGGER.info("Updtae last name of family member  [{}] [{}]", name.getFirstName(), name.getLastName());

        //update in DB

        return Response.ok().build();
    }
}

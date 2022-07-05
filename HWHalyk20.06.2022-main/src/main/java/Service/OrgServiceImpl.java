package main.java.Service;

import com.sun.org.apache.xpath.internal.operations.Or;
import main.java.Organization.Organization;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Path("/organization")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class OrgServiceImpl implements OrgService {
    private static Map<Integer,Organization> organizationMap = new HashMap<Integer,Organization>();
    @Override
    @POST
    @Path("/add")
    public Response addOrganization(Organization o) {
        Response response = new Response();
        if(organizationMap.get(o.getId()) != null){
            response.setStatus(false);
            response.setMessage("Organization Already Exists");
            return response;
        }
        organizationMap.put((int) o.getId(), o);
        response.setStatus(true);
        response.setMessage("Organization created successfully");
        return response;
    }

    @Override
    @GET
    @Path("/{id}/delete")
    public Response deleteOrganization(@PathParam("id") int id) {
        Response response = new Response();
        if(organizationMap.get(id) == null){
            response.setStatus(false);
            response.setMessage("Organization Doesn't Exists");
            return response;
        }
        organizationMap.remove(id);
        response.setStatus(true);
        response.setMessage("Organization deleted successfully");
        return response;
    }

    @Override
    @GET
    @Path("/{id}/get")
    public Organization getOrganization(@PathParam("id") int id) {
        return organizationMap.get(id);
    }

    @GET
    @Path("/{id}/getDummy")
    public Organization getAnotherOrg(@PathParam("id") int id) {
        Organization o = new Organization();
        o.setId(27408);
        o.setTitle("Steelov LLC");
        o.setCreationDate(LocalDate.of(2018, Month.SEPTEMBER,2));
        return o;
    }




    @Override
    @GET
    @Path("/getAll")
    public Organization[] getAllOrganizations() {
        Set<Integer> ids = organizationMap.keySet();
        Organization[] o = new Organization[ids.size()];
        int i=0;
        for(Integer id : ids){
            o[i] = organizationMap.get(id);
            i++;
        }
        return o;
    }

}

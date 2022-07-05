package main.java.Service;

import main.java.Organization.Organization;

public interface OrgService {

    public main.java.Service.Response addOrganization(Organization o);

    public Response deleteOrganization(int id);

    public Organization getOrganization(int id);

    public Organization[] getAllOrganizations();

}
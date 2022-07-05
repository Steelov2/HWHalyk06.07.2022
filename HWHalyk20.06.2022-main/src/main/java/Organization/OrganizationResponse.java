package main.java.Organization;

import java.util.ArrayList;
import java.util.List;

public class OrganizationResponse {
    List<Organization> organizationList= new ArrayList<>();
    private boolean status;
    private String message;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

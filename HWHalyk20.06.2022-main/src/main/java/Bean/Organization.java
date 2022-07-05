package Bean;

import java.time.LocalDate;

public class Organization{
    long id;
    String title;
    String Address;
    LocalDate creationDate;

    public Organization() {
        super();
    }

    public Organization(long id, String title, String address, LocalDate creationDate) {
        this.id = id;
        this.title = title;
        Address = address;
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
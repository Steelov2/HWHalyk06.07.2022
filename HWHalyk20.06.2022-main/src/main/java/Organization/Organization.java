package main.java.Organization;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


import java.time.LocalDate;
@XmlRootElement(name = "user")
public class Organization implements Serializable  {
    long id;
    String Title;
    String Address;
    LocalDate creationDate;

    public Organization() {}
    public Organization(long id, String title, String address, LocalDate creationDate) {
        this.id = id;
        Title = title;
        Address = address;
        this.creationDate = creationDate;
    }


    public long getId() {
        return id;
    }
    @XmlElement
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }
    @XmlElement
    public void setTitle(String title) {
        Title = title;
    }

    public String getAddress() {
        return Address;
    }
    @XmlElement
    public void setAddress(String address) {
        Address = address;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
    @XmlElement
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}

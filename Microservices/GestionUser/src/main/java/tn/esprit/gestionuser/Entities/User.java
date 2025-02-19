package tn.esprit.gestionuser.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String photo;
    private int CIN;
    private Date dateOfBirth;
    private boolean isActive;

    public Long getIdUser() {return idUser;}

    public void setIdUser(Long idUser) {this.idUser = idUser;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getPhoto() {return photo;}

    public void setPhoto(String photo) {this.photo = photo;}

    public int getCIN() {return CIN;}

    public void setCIN(int CIN) {this.CIN = CIN;}

    public Date getDateOfBirth() {return dateOfBirth;}

    public void setDateOfBirth(Date dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public boolean isActive() {return isActive;}

    public void setActive(boolean active) {isActive = active;}

    public User() {}

    public User(Long idUser,
                String firstName,
                String lastName,
                String email,
                String password,
                String photo,
                int CIN, Date dateOfBirth,
                boolean isActive) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.CIN = CIN;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
    }
}

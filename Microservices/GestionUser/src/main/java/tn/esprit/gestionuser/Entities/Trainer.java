package tn.esprit.gestionuser.Entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Trainer extends User {
    private String domain;


    public Trainer() {}

    public Trainer(Long idUser, String firstName, String lastName, String email, String password, String photo, int CIN, Date dateOfBirth, boolean isActive) {
        super(idUser, firstName, lastName, email, password, photo, CIN, dateOfBirth, isActive);}

    public String getDomain() {return domain;}

    public void setDomain(String domain) {this.domain = domain;}


}

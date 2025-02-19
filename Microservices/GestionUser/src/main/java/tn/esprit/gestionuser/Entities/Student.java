package tn.esprit.gestionuser.Entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Student extends User {

private Date inscriptionDate;
private String CV;
private String resultat;
private Badge badge;

}
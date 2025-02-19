package tn.esprit.gestionuser.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionuser.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

}

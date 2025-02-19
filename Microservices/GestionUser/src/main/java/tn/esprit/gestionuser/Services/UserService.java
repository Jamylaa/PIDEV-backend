package tn.esprit.gestionuser.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionuser.Entities.User;
import tn.esprit.gestionuser.Repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
@Autowired
    private UserRepository userRepository;


  // public List<User> getAllUser() {return  userRepository.findAll(); }
  public  User getUserById(Long idUser) {return userRepository.findById(idUser).get();}

//   public User findByName(String firstName){
//   return  userRepository.findByFirstName(firstName);}

    public User addUser(User user) {return userRepository.save(user);}
    public User updateUser(User user) {return userRepository.save(user);}
    public void deleteUser(Long idUser) {userRepository.deleteById(idUser);}



}

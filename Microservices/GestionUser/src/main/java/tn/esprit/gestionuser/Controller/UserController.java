package tn.esprit.gestionuser.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionuser.Entities.User;
import tn.esprit.gestionuser.Services.UserService;
import java.util.List;

@RestController
@RequestMapping("/Mic2")
        //("/Users")

public class UserController {


    @GetMapping("/GestionUsers")
    public String sayHello() {return " Welcome to Mic1_GestionUsers ";}
    @Autowired
    private UserService userService;
   // @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

//    @GetMapping("/{Get_List_Of_Users}")
//    public ResponseEntity<List <User>> getAllUsers() {
//        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
//    }

    @GetMapping("/{getUserById}")

    public ResponseEntity<User> getUserById(@RequestParam("idUser") Long idUser){
         return new ResponseEntity<>(userService.getUserById(idUser),
                 HttpStatus.OK); }
//
//    @GetMapping("/{geUserByFirstName}")
//    public ResponseEntity<User> getUserByFirstName(@RequestParam String firstName){
//         return new ResponseEntity<>(userService.findByName(firstName),
//                 HttpStatus.OK); }

    @PostMapping("/add-User")
    public ResponseEntity<User> addUser(@RequestBody User user){
         return new ResponseEntity<>(userService.addUser(user),
                 HttpStatus.CREATED);}

    @PutMapping("/update-User")
    public ResponseEntity<User> updateUser(@PathVariable Long idUser
        ,@RequestBody User user){
        return new ResponseEntity<>(userService.updateUser(user),
                HttpStatus.OK); }

    @DeleteMapping("/delete-by-IdUser")
    public ResponseEntity deleteUs(@RequestParam("idUser") Long idUser) {
        userService.deleteUser(idUser);
        return new ResponseEntity<>("Successfully deleted",HttpStatus.OK);
    }



}
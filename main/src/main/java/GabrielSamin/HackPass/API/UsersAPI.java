package GabrielSamin.HackPass.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GabrielSamin.HackPass.Document.Users;
import GabrielSamin.HackPass.Repository.UserRepo;

@RestController
@RequestMapping("/")
public class UsersAPI {
    @Autowired
    UserRepo userRepo;

    @GetMapping("users")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> l = userRepo.findAll();
        return new ResponseEntity<List<Users>>(l, HttpStatus.OK);
    }
}

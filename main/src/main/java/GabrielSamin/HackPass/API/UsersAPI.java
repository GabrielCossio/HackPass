package GabrielSamin.HackPass.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GabrielSamin.HackPass.DTO.UsersDTO;
import GabrielSamin.HackPass.Service.UserService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/")
public class UsersAPI {
    @Autowired
    UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<UsersDTO>> getAllUsers() {
        List<UsersDTO> l = userService.getAllUsers();
        return new ResponseEntity<List<UsersDTO>>(l, HttpStatus.OK);
    }
    
    @GetMapping("user/{id}")
    public ResponseEntity<UsersDTO> getUserById(@PathVariable String id) {
        UsersDTO dto = userService.findById(id);
        return new ResponseEntity<UsersDTO>(dto, HttpStatus.OK);
    }

    @PostMapping("user")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<UsersDTO> addUser(@RequestBody @Valid UsersDTO entity) {
        entity = userService.addUser(entity);
        return new ResponseEntity<UsersDTO>(entity, HttpStatus.CREATED);
    }

    @PutMapping("user/{id}")
    public ResponseEntity<UsersDTO> updateCheckinStatus(@PathVariable String id) {
        UsersDTO updatedUsersDTO = userService.updateCheckinStatus(id);

        if (updatedUsersDTO != null) { 
            return new ResponseEntity<UsersDTO>(updatedUsersDTO, HttpStatus.OK); //return 200 OK w/ updated DTO
        } else{
            return new ResponseEntity<UsersDTO>(updatedUsersDTO, HttpStatus.NOT_FOUND); //404 user not found
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(@PathVariable String Id){
        if(userService.deleteUser(Id)){
            return new ResponseEntity<String>("User " + Id + " Has Been Deleted", HttpStatus.OK);
        } else{
            return new ResponseEntity<String>("User " + Id + " Does Not Exist", HttpStatus.NOT_FOUND);
        }

    }
}
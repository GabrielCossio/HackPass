package GabrielSamin.HackPass.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GabrielSamin.HackPass.DTO.UsersDTO;
import GabrielSamin.HackPass.Service.UserService;

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
    public ResponseEntity<UsersDTO> getUserByName(@PathVariable String id) {
        UsersDTO dto = userService.findByStudentId(id);
        return new ResponseEntity<UsersDTO>(dto, HttpStatus.OK);
    }
}

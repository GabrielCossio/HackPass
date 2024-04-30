package GabrielSamin.HackPass.API;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import GabrielSamin.HackPass.DTO.UsersDTO;
import jakarta.validation.Valid;

public interface UsersAPI {
    public ResponseEntity<List<UsersDTO>> getAllUsers();
    public ResponseEntity<UsersDTO> getUserById(@PathVariable String id);
    public ResponseEntity<UsersDTO> addUser(@RequestBody @Valid UsersDTO entity);
    public ResponseEntity<UsersDTO> updateCheckinStatus(@PathVariable String id);
    public ResponseEntity<String> deleteUser(@PathVariable String Id);
}

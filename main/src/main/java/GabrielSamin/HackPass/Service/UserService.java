package GabrielSamin.HackPass.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import GabrielSamin.HackPass.DTO.UsersDTO;
import GabrielSamin.HackPass.Repository.UserRepo;

public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<UsersDTO> getAllUsers(){
        
        return null;
    }
}

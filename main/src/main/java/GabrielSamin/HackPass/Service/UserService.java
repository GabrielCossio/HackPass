package GabrielSamin.HackPass.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GabrielSamin.HackPass.DTO.UsersDTO;
import GabrielSamin.HackPass.Document.Users;
import GabrielSamin.HackPass.Repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<UsersDTO> getAllUsers(){
        List<Users> usersList = userRepo.findAll();
        return usersList.stream().map(u->u.DocToDTO()).collect(Collectors.toList());
    }

    public UsersDTO findById(String id){
        ObjectId ID = new ObjectId(id);
        Users u = userRepo.findBy_id(ID);
        
        return u.DocToDTO();
    }

    public UsersDTO addUser(UsersDTO u){
        
        Users newUser = u.DTOToDoc();
        u = userRepo.save(newUser).DocToDTO();

        return u;
    }
}

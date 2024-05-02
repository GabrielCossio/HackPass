package GabrielSamin.HackPass.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Scanner;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GabrielSamin.HackPass.DTO.UsersDTO;
import GabrielSamin.HackPass.Document.Users;
import GabrielSamin.HackPass.Repository.UserRepo;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserRepo userRepo;
    private long maxCount;
    
    public UserServiceImp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Max Attendance: ");
        this.maxCount = scanner.nextLong();
        scanner.close();
    }

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
        if(userRepo.count()>=maxCount){
            newUser.setWaitlistStatus(true);
        }
        u = userRepo.save(newUser).DocToDTO();

        return u;
    }

    public UsersDTO updateCheckinStatus (String id) {
        Optional<UsersDTO> optionalUser = Optional.of(this.findById(id));

        if(optionalUser.isPresent()){
            UsersDTO userDTO = optionalUser.get();
            Users user = userDTO.DTOToDoc();
            user.setCheckinStatus(true);
            user.setCheckinTime(new Date());
            user.set_id(new ObjectId(id));
            Users updatedUser = userRepo.save(user);
            return updatedUser.DocToDTO();
        } else {
            return null;
        }

    }

    public Boolean deleteUser(String id){
        Optional<UsersDTO> optionalUser = Optional.of(this.findById(id));
        if(optionalUser.isPresent()){
            Users userToDelete = optionalUser.get().DTOToDoc();
            userRepo.delete(userToDelete);
            return true;
        } else{
            return false;
        }
    }
}

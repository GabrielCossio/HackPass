package GabrielSamin.HackPass.Service;

import java.util.List;

import GabrielSamin.HackPass.DTO.UsersDTO;

public interface UserService {
    public List<UsersDTO> getAllUsers();
    public UsersDTO findById(String id);
    public UsersDTO addUser(UsersDTO u);
    public UsersDTO updateCheckinStatus (String id);
    public Boolean deleteUser(String id);
}

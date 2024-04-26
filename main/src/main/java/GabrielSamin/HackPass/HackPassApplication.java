package GabrielSamin.HackPass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import GabrielSamin.HackPass.Repository.UserRepo;

@SpringBootApplication
public class HackPassApplication implements CommandLineRunner{
    
    @Autowired
    UserRepo userRepository;

    public static void main(String[] args) {
        SpringApplication.run(HackPassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //ObjectId id = new ObjectId();
        //Users user1 = new Users(id, "Samin Yasar", "samin2668@gmail.com", "405861");
        //userRepository.save(user1);
    }
}

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
        
    }
}

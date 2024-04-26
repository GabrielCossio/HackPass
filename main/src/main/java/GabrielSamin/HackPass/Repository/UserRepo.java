package GabrielSamin.HackPass.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import GabrielSamin.HackPass.Document.Users;
public interface UserRepo extends MongoRepository<Users, ObjectId> {
    
}
package GabrielSamin.HackPass.Repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import GabrielSamin.HackPass.Document.Users;

@Repository
public interface UserRepo extends MongoRepository<Users, ObjectId> {
    public Users findBy_id(ObjectId _id);
}
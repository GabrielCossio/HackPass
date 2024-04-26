package GabrielSamin.HackPass.Document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {
    
    @Id
    private ObjectId _id;
    private String name;
    private String email;
    private String password;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users(ObjectId _id, String name, String email, String password) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

}

package GabrielSamin.HackPass.Document;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import GabrielSamin.HackPass.DTO.UsersDTO;

@Document("users")
public class Users {
    
    @Id
    private ObjectId _id;
    private String name;
    private String email;
    private String university;
    private String studentId;
    private Date checkinTime;
    private Boolean checkinStatus;
    private Boolean waitlist;

    public Users() {
        
    }

    public Users(String name, String email, String university, 
        String studentId, Boolean waitlist) {
        this._id = new ObjectId();
        this.name = name;
        this.email = email;
        this.university = university;
        this.studentId = studentId;
        this.checkinTime = new Date();
        this.checkinStatus = false;
        this.waitlist = waitlist;
    }

    public UsersDTO DocToDTO(){
        return new UsersDTO(this.name, this.email, this.university,
        this.studentId, this.checkinTime, this.checkinStatus);
    }

    public ObjectId get_id() {
        return _id;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Boolean getCheckinStatus() {
        return checkinStatus;
    }

    public void setCheckinStatus(Boolean checkinStatus) {
        this.checkinStatus = checkinStatus;
    }

    public Boolean getWaitlistStatus() {
        return waitlist;
    }

    public void setWaitlistStatus(Boolean waitlist) {
        this.waitlist = waitlist;
    }

}

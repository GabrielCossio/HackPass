package GabrielSamin.HackPass.DTO;

import java.util.Date;

import org.bson.types.ObjectId;

public class UsersDTO {
    
    private ObjectId _id;
    private String name;
    private String email;
    private String university;
    private String studentId;
    private Date checkinTime;
    private Boolean checkinStatus;

    public UsersDTO(ObjectId _id, String name, String email, String university, 
        String studentId, Date checkinTime, Boolean checkinStatus) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.university = university;
        this.studentId = studentId;
        this.checkinTime = checkinTime;
        this.checkinStatus = checkinStatus;
    }

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

    
}

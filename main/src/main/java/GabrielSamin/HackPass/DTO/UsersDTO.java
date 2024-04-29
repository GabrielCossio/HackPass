package GabrielSamin.HackPass.DTO;

import java.util.Date;

import GabrielSamin.HackPass.Document.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UsersDTO {
    
    @NotBlank(message = "Name Is Required")
    private String name;
    @NotBlank(message = "Email Is Required")
    @Email(message = "Email Is Not Valid")
    private String email;
    @NotBlank(message = "University Is Required")
    private String university;
    @NotBlank(message = "Student ID Is Required")
    private String studentId;
    private Date checkinTime;
    private Boolean checkinStatus;

    public UsersDTO(){
        
    }

    public UsersDTO(String name, String email, String university, 
        String studentId, Date date, Boolean checkinStatus) {
        this.name = name;
        this.email = email;
        this.university = university;
        this.studentId = studentId;
        this.checkinTime = date;
        this.checkinStatus = checkinStatus;
    }

    public UsersDTO(String name, String email, String university, 
        String studentId) {
        this.name = name;
        this.email = email;
        this.university = university;
        this.studentId = studentId;
        this.checkinTime = null;
        this.checkinStatus = null;
    }

    public Users DTOToDoc(){
        Users newUser = new Users(this.name, this.email, 
        this.university, this.studentId);

        return newUser;
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

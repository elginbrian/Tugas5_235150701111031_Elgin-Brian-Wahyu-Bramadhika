package model;

public class RegisterModel {
    public String fullname;
    public String birthDate;
    public String registerNum;
    public String phoneNum;
    public String address;
    public String email;

    public RegisterModel(
            String fullname,
            String birthDate,
            String registerNum,
            String phoneNum,
            String address,
            String email
    ){
        this.fullname    = fullname;
        this.birthDate   = birthDate;
        this.registerNum = registerNum;
        this.phoneNum    = phoneNum;
        this.address     = address;
        this.email       = email;
    }
}

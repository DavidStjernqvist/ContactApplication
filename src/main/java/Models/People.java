package Models;

public class People {
    private String fullName;
    private String adress;
    private String phoneNumber;
    private String workNumber;
    private int dateOfBirth;

//To instantiate all of the values
    public People(String fullName, String adress, String phoneNumber, String workNumber, int dateOfBirth) {
        this.fullName = fullName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.workNumber = workNumber;
        this.dateOfBirth = dateOfBirth;
    }
//Constructor to instatiate all values except worknumber who can be left blank
    public People(String fullName, String adress, String phoneNumber, int dateOfBirth) {
        this.fullName = fullName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
    //Empty constructor to create a object
    public People(){

    }
    public String getFullName() {
        return fullName;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getWorkNumber() {
        return workNumber;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
}

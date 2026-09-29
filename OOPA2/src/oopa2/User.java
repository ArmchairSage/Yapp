package oopa2;

public class User {
    private String forename, surname, dob, email, password, lastLogin, regDate;
    private boolean locked;
    private int userID, friends;
    //fields

    public User(int userID, String forename, String surname, String dob, String email, String password, String regDate) {
        this.userID = userID;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.email = email;
        this.password = password;
        locked = false;
        lastLogin = "";
        this.regDate = regDate;
        friends = 0;
    }//Constructor
    
    public User() {
        userID = 9999;
        forename = "John";
        surname = "Doe";
        dob = "01/01/2008";
        email = "unknown";
        password = "defaultPassword2026";
        lastLogin = "26/04/2026";
        regDate = "26/04/2026";
        locked = false;
        friends = 0;
    }//Default Constructor

    public int getUserID() {
        return userID;
    }//getUserID

    public String getForename() {
        return forename;
    }//getForename

    public String getSurname() {
        return surname;
    }//getSurname

    public String getDoB() {
        return dob;
    }//getDoB

    public String getEmail() {
        return email;
    }//getEmail

    public String getPassword() {
        return password;
    }//getPassword

    public String getLastLogin() {
        return lastLogin;
    }//getLastLogin

    public String getRegDate() {
        return regDate;
    }//getRegDate

    public boolean isLocked() {
        return locked;
    }//isLocked

    public int getFriends() {
        return friends;
    }//getFriends



    public void setForename(String forename) {
        this.forename = forename;
    }//setForename

    public void setSurname(String surname) {
        this.surname = surname;
    }//setSurname

    public void setDob(String dob) {
        this.dob = dob;
    }//setDob

    public void setEmail(String email) {
        this.email = email;
    }//setEmail

    public void setPassword(String password) {
        this.password = password;
    }//setPassword

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }//setLastLogin

    public void setLocked(boolean locked) {
        this.locked = locked;
    }//setLocked

    public void setFriends(int friends) {
        this.friends = friends;
    }//setFriends
    
    public String basicInfo() {
        return "(" + userID + ") " + this.forename + " " + this.surname;
    }//basicInfo
    
    public String fullDetails() {
        return "<html>User ID: " + getUserID()
                + "<br><br>Name: " + getForename() + " " + getSurname()
                + "<br><br>Date of Birth: " + getDoB()
                + "<br><br>Email: " + getEmail()
                + "<br><br>Password: " + getPassword()
                + "<br><br>Locked: " + isLocked()
                + "<br><br>Last Login: " + getLastLogin()
                + "<br><br>Date Registered: " + getRegDate()
                + "<br><br>Friends: " + getFriends() + "<br></html>";
    }//details
}//class
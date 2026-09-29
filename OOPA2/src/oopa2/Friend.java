package oopa2;

public class Friend {
    private int userID, friendID;
    private String dateTime;
    //fields
    
    public Friend (int userID, int friendID, String dateTime) {
        this.userID = userID;
        this.friendID = friendID;
        this.dateTime = dateTime;
    }//Constructor

    public int getUserID() {
        return userID;
    }//getUserID

    public int getFriendID() {
        return friendID;
    }//getFriendID

    public String getDateTime() {
        return dateTime;
    }//getDateTime

    
    
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }//setDateTime
    
    
    
    public String basicInfo() {
        return getFriendID()
                + "\nAdded: " + getDateTime();
    }//details
}//class
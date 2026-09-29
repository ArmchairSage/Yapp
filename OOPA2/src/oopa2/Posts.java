package oopa2;

import java.util.ArrayList;

public class Posts {
    private int postID, userID;
    private String postSecurity, date;
    private ArrayList commentsAL;
    //fields

    public Posts(int postID, int userID, String postSecurity, String date) {
        this.postID = postID;
        this.userID = userID;
        this.postSecurity = postSecurity;
        this.date = date;
        commentsAL = new ArrayList();
    }//Constructor

    public int getPostID() {
        return postID;
    }//getPostID

    public int getUserID() {
        return userID;
    }//getUserID

    public String getPostSecurity() {
        return postSecurity;
    }//getPostSecurity

    public String getPostDate() {
        return date;
    }//getPostDate
    
    public ArrayList getComments() {
        return commentsAL;
    }//getComments



    public void setPostSecurity(String postSecurity) {
        this.postSecurity = postSecurity;
    }//setPostSecurity

    public void setPostDate(String date) {
        this.date = date;
    }//setPostDate
    
    public void addComment(String comment) {
        commentsAL.add(comment);
    }//addComment



    public String details() {
        return "<html>[Posted on " + getPostDate() + "]<br>";
    }//details
}//class
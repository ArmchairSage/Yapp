package oopa2;

public class Text extends Posts {
    private String text;
    //field
    
    public Text (int postID, int userID, String postSecurity, String date, String text) {
        super(postID, userID, postSecurity, date);
        this.text = text;
    }//Constructor

    public String getText() {
        return text;
    }//getText

    public void setText(String text) {
        this.text = text;
    }//setText
    
    
    
    public String details() {
        return super.details() 
                + "<br>" + getText() + "</html>";
    }//details
}//class
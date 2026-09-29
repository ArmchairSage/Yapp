package oopa2;

public class Image extends Posts {
    private String name, description, location;
    //fields 

    public Image (int postID, int userID, String postSecurity, String date, String name, String description, String location) {
        super(postID, userID, postSecurity, date);
        this.name = name;
        this.description = description;
        this.location = location;
    }//Constructor

    public String getImageName() {
        return name;
    }//getImageName

    public String getDescription() {
        return description;
    }//getDescription

    public String getLocation() {
        return location;
    }//getLocation



    public void setImageName(String name) {
        this.name = name;
    }//setImageName

    public void setDescription(String description) {
        this.description = description;
    }//setDescription

    public void setLocation(String location) {
        this.location = location;
    }//setLocation
    
    
    
    public String details() {
        return super.details() 
                + "<br>" + getImageName()
                + "<br>" + getDescription()
                + "<br>" + getLocation() + "</html>";
    }//details
}//class
package oopa2;

import java.util.ArrayList;
import java.time.*;
import java.time.format.*;

public class AppData {

    public static FrmMenu menuScreen;
    public static FrmSplash splashScreen;
    public static FrmRegister registerScreen;
    public static FrmLogin loginScreen;
    public static FrmMain mainScreen;

    public static FrmAddPost addPostScreen;
    public static FrmMyPosts myPostsScreen;
    public static FrmPublicPosts publicPostsScreen;
    public static FrmViewFriendPosts viewFriendPostsScreen;
    public static FrmAddFriend addFriendScreen;
    public static FrmFriendsMenu friendsMenuScreen;

    public static ArrayList usersAL = new ArrayList(); 
    public static ArrayList postsAL = new ArrayList();
    public static ArrayList friendsAL = new ArrayList();

    public static User loggedOn;



    public static String genDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        String dateStr = today.format(formatter);
        return dateStr;
    }//genDate

    public static String genDateTime() {
        LocalDateTime todayDT = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");

        String dateTimeStr = todayDT.format(formatter);
        return dateTimeStr;
    }//genDateTime

    public static boolean isUniqueUID(int id) {
        //usersAL = new ArrayList();
        for (int index = 0; index < usersAL.size(); index++) {
            User auser = (User) usersAL.get(index);
            if (auser.getUserID() == id) {
                return false;
            }
        }//for
        return true;
    }//isUniqueUID
    
    public static boolean isUniquePostID(int pid) {
        for (int index = 0; index < postsAL.size(); index++) {
            Posts post = (Posts) postsAL.get(index);
            if (post.getPostID() == pid)
                return false;
        }//for
        return true;
    }//isUniquePostID

    public static boolean validLogon(String email, String password) {
        for (int index = 0; index < usersAL.size(); index++) {
            User auser = (User) usersAL.get(index);
            if (auser.getEmail().equals(email) && auser.getPassword().equals(password)) {
                auser.setLastLogin(genDateTime());
                loggedOn = auser;
                return true;
            }//if
        }//for
        loggedOn = null;
        return false;
    }//validLogon

    public static Posts findPost(int pid) {
        for (int index = 0; index < postsAL.size(); index++) {
            Posts post = (Posts) postsAL.get(index);
            if (post.getPostID() == pid)
                return post;
        }//for
        return null;
    }//findPost
    
    public static User findUser(int uid) {
        for (int index = 0; index < usersAL.size(); index++) {
            User foundUser = (User) usersAL.get(index);
            if (foundUser.getUserID() == uid)
                return foundUser;
        }//for
        return null;
    }//findUser
    
    public static boolean friendAlready(int uid, int fid) {
        for (int index = 0; index < friendsAL.size(); index++) {
            Friend frd = (Friend) friendsAL.get(index);
            if(frd.getUserID() == uid && frd.getFriendID() == fid)
                return true;
        }//for
        return false;

    }//friendAlready
    
    public static void loadData() {
        User tmpUser = new User(3355, "frank", "stein", "02/03/44", "f@s.com", "pass", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        tmpUser = new User(4242, "betty", "boop", "08/03/77", "b@b.com", "bye", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        tmpUser = new User(4944, "jenny", "wot", "20/05/99", "j@wot.com", "what", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        tmpUser = new User(1007, "james", "bond", "07/06/02", "j@bond.com", "spy", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        tmpUser = new User(8888, "Ted", "Bear", "12/10/01", "t@b.com", "pass", "07/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        Image imgPost;
        Text txtPost;

        imgPost = new Image(23456, 3355, "public", "08/05/26 11:54:20", "myfile.txt", "big file", "c:/temp");
        AppData.postsAL.add(imgPost);

        txtPost = new Text(23467, 3355, "private", "08/05/26 11:54:30", "mary had dinner");
        AppData.postsAL.add(txtPost);

        imgPost = new Image(23400, 4242, "public", "08/05/26 11:55:20", "myfile.txt", "big file", "c:/temp");
        AppData.postsAL.add(imgPost);

        txtPost = new Text(23404, 4242, "private", "08/05/26 11:56:30", "mary had supper");
        AppData.postsAL.add(txtPost);

        imgPost = new Image(23401, 4242, "public", "08/05/26 11:55:20", "yourfile.txt", "small file", "c:/temp");
        AppData.postsAL.add(imgPost);

        txtPost = new Text(23444, 3355, "public", "08/05/26 11:56:30", "mary had breakfast");
        AppData.postsAL.add(txtPost);
    }//loadData
}//class

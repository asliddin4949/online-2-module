package OOPandCollections.Lesson3.uz.pdp.online.model;

import java.util.Scanner;

public class User {
    int userID;
    public String username;
    public String email;
    private String password;
    String name;
    String address;

    public User(int userID, String username, String email, String name, String address) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.name = name;
        this.address = address;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your old password: ");
        String password = scanner.next();
        if(password.equals(this.password)){
            System.out.println("Create new password: ");
            this.password = scanner.next();
            System.out.println("Your password successfully updated!");
        }else {
            System.err.println("You entered wrong password!");
        }
    }
    public static void main(String[] args) {
        User user = new User(1,"muminov","muminov4949@inbox.ru","Asliddin","Termiz");
        user.setPassword("a3514949");
        user.changePassword();
    }
    public int getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}

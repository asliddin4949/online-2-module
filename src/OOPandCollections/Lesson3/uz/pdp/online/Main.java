package OOPandCollections.Lesson3.uz.pdp.online;

import OOPandCollections.Lesson3.uz.pdp.online.model.User;

public class Main {
    public static void main(String[] args) {
        User[] user = new User[5];
        user[0]= new User(1,"user1","user1@pdp.uz","User1","PDP");
        user[1]= new User(2,"user2","user2@pdp.uz","User2","PDP");
        user[2]= new User(3,"user3","user3@pdp.uz","User3","PDP");
        user[3]= new User(4,"user4","user4@pdp.uz","User4","PDP");
        user[4]= new User(5,"user5","user5@pdp.uz","User5","PDP");


        System.out.println("* * * * * U s e r s * * * * * ");
        System.out.println();

        for (int i = 0; i < user.length; i++) {
            System.out.println("User ID - "+user[i].getUserID()+" Username: "+user[i].username
                    +" Email: "+user[i].email+" Name: "+user[i].getName()+" Address: "+user[i].getAddress());
            System.out.println();
        }

    }
}

package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserSaver us = new UserSaver(user);
        UserReporter ur = new UserReporter(user);
        us.save();
        ur.report();
    }
}
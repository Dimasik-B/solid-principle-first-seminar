package homework;

public class UserReporter implements Reportable{
    private final User user;

    public UserReporter(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}

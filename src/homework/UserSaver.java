package homework;

public class UserSaver implements Savable{
    User user;

    public UserSaver(User user) {
        this.user = user;
    }

    public void save(){
        Persister persister = new Persister(this.user);
        persister.save();
    }
}

package sg.np.edu.mad.exercise2;

public class User {
    String name;

    String description;

    Integer Id;

    Boolean followed;

    public User(String n, String desc, int id, boolean f) {
        name = n;
        description = desc;
        Id = id;
        followed = f;
    }
}

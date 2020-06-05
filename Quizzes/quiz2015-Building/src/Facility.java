import java.util.HashSet;
import java.util.Set;

public abstract class Facility {
    private String name;
    private int capacity ;
    private Set<User> authorizedUsers;

    public Facility(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.authorizedUsers = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void authorize(User u){
        authorizedUsers.add(u);
    }

    public boolean canEnter(User u){
        return authorizedUsers.contains(u);
    }
}

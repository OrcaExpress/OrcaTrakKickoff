import java.io.Serializable;

/**
 
 * Now, a user can have multiple quotes, so a many-to-one defined in Quote will
 * be nice. We will see if one-to-many is User is necesary or not in the future.
 *
 */
public class User implements Serializable {

    private String firstName;
    private String lastName;

    public User() {         
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

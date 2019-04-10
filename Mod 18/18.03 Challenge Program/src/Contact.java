/**
 * <p>Defines an entry in a contact list</p>
 *
 * @author James Harbour
 * @version 4/9/19
 */
public class Contact {
    // entry's name, relation to you, birthday, phone number, and email address.
    private String name;
    private String relation;
    private String birthday;
    private String phonenum;
    private String email;

    public Contact(String name, String relation, String birthday, String phonenum, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phonenum = phonenum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%15s\t|\t%15s\t|\t%15s\t|\t%12s\t|\t%25s", name, relation, birthday, phonenum, email);
    }
}

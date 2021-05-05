import java.util.Date;
import java.util.GregorianCalendar;

public class Player extends User{
    private String nickName;
    private Date birthDate;

    public Player(String firstName, String lastName, String id, String nickName, Date birthDate) {
        super(firstName, lastName, id);
        this.nickName = nickName;
        this.birthDate = birthDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

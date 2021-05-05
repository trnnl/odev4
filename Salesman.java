public class Salesman extends User{
    private String experience;

    public Salesman(String firstName, String lastName, String id, String experience) {
        super(firstName, lastName, id);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
